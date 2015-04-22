package com.formsdirectinc.pdf;

import com.formsdirectinc.schema.interaction.model.ApplicationStatus;
import com.formsdirectinc.ui.interaction.InteractionMgr;
import com.formsdirectinc.ui.interaction.MockInteractionMgr;
import com.formsdirectinc.xao.ApplicationXAO;
import com.formsdirectinc.xao.UserDataXAO;
import org.xml.sax.InputSource;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * ObjectScrubberBaseTest: Test class for ObjectScrubberBase
 * <p/>
 * Author: <a href="mailto:hari@dcis.net">Hari Selvarajan</a>
 * Date: 11/5/13 5:46 PM
 * <p/>
 * Revision: $Rev$
 */
public class ObjectScrubberBaseTest {
    /**
     * Main method, for testing
     *
     * @param args
     * @throws Exception
     */

    public static void main(String... args) throws Exception {
        ObjectScrubberBase scrubber = new ObjectScrubberBase();

        ApplicationXAO applicationXAO = ApplicationXAO.getInstance();
        applicationXAO.setXMLFileName("application-libs/i90Application.xml");
        applicationXAO.init();

        scrubber.setApplicationXAO(applicationXAO);

        InteractionMgr interactionMgr = new InteractionMgr();

        MockInteractionMgr mockInteractionMgr = new MockInteractionMgr();
        scrubber.setInteractionManager(mockInteractionMgr);

        applicationXAO.pagesInStage("1");
        applicationXAO.controlsOnPage("SQ-1.1");

        scrubber.setUserDataXAO(UserDataXAO.getInstance());

        Object applicationData = UserDataXAO.getInstance().unmarshalXML("com.formsdirectinc.schema.forms.i90",

                "com.formsdirectinc.schema.forms.i90.I90",
                new InputSource(new FileReader("application-libs/i90xml.xml")));

        ApplicationStatus interactionData =
                interactionMgr.fileInteractionUnmarshaller("application-libs/i90interaction.xml");

        Object copy = scrubber.scrubObject("1", applicationData, interactionData);

        FileWriter fw = new FileWriter("/tmp/scrubbedobject-new.xml");
        fw.write(UserDataXAO.getInstance().marshalObject(copy));
        fw.close();

        Object copy2 = UserDataXAO.getInstance().deepClone(applicationData);
        //new com.formsdirectinc.apps.i90.pdf.ObjectScrubber().clean(copy2);

        fw = new FileWriter("/tmp/scrubbedobject-old.xml");
        fw.write(UserDataXAO.getInstance().marshalObject(copy2));
        fw.close();

    }
}
