package com.formsdirectinc.ui.interaction;

import com.formsdirectinc.schema.interaction.model.ApplicationStatus;
import com.formsdirectinc.schema.interaction.model.PageStateEnum;
import com.formsdirectinc.schema.interaction.model.PageStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * MockInteractionMgr: Mock class for interaction manager
 * <p/>
 * Author: <a href="mailto:hari@dcis.net">Hari Selvarajan</a>
 * Date: 10/30/13 1:00 PM
 * <p/>
 * Revision: $Rev$
 */
public class MockInteractionMgr extends InteractionMgr {
    public List<PageStatus> getUserPageStatusList(String stageID, Object applicationData,
                                                  ApplicationStatus interactionData) {
        List<PageStatus> pageStatusList = new ArrayList<PageStatus>();

        String[] pageIDs = {
                "SQ-1.1",
                "SQ-1.1.2",
                "SQ-1.1.3",
                "SQ-1.1.3.1",
                "SQ-1.1.4",
                "SQ-1.2.1",
                "SQ-1.2.2",
                "SQ-1.3",
                "SQ-2.1",
                "SQ-3.1",
                "SQ-4.1",
                "SQ-4.2",
                "SQ-4.3",
                "SQ-5.1",
        };

        for (String pageID: pageIDs) {
            PageStatus pageStatus = new PageStatus();
            pageStatus.setPageID(pageID);
            pageStatus.setPageState(PageStateEnum.PAGE_STATUS_COMPLETE);
            pageStatus.setPageRuleBase("SQ");

            pageStatusList.add(pageStatus);
        }

        return pageStatusList;
    }
}
