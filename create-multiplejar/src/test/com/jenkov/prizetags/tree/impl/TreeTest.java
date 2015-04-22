/*
 * TreeTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.jenkov.prizetags.tree.impl;

import junit.framework.*;
import com.jenkov.prizetags.tree.itf.*;
import java.util.*;
import java.io.Serializable;

/**
 *
 * @author rajesh
 */
public class TreeTest extends TestCase {
    
    public TreeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TreeTest.class);
        
        return suite;
    }

    /**
     * Test of getRoot method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testGetRoot() {
        System.out.println("getRoot");
        
        Tree instance = new Tree();
        
        ITreeNode expResult = null;
        ITreeNode result = instance.getRoot();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoot method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSetRoot() {
        System.out.println("setRoot");
        
        ITreeNode node = null;
        Tree instance = new Tree();
        
        instance.setRoot(node);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNode method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testFindNode() {
        System.out.println("findNode");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        ITreeNode expResult = null;
        ITreeNode result = instance.findNode(treeNodeId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNodes method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testFindNodes() {
        System.out.println("findNodes");
        
        Set treeNodeIds = null;
        Tree instance = new Tree();
        
        Set expResult = null;
        Set result = instance.findNodes(treeNodeIds);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExpanded method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsExpanded() {
        System.out.println("isExpanded");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isExpanded(treeNodeId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expand method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpand() {
        System.out.println("expand");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        instance.expand(treeNodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandAll method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandAll() {
        System.out.println("expandAll");
        
        Tree instance = new Tree();
        
        instance.expandAll();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandParent method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandParent() {
        System.out.println("expandParent");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandParent(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandParentAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandParentAndSelf() {
        System.out.println("expandParentAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandParentAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandChildren method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandChildren() {
        System.out.println("expandChildren");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandChildren(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandChildrenAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandChildrenAndSelf() {
        System.out.println("expandChildrenAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandChildrenAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandAncestors method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandAncestors() {
        System.out.println("expandAncestors");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandAncestors(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandAncestorsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandAncestorsAndSelf() {
        System.out.println("expandAncestorsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandAncestorsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandDescendants method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandDescendants() {
        System.out.println("expandDescendants");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandDescendants(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expandDescendantsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testExpandDescendantsAndSelf() {
        System.out.println("expandDescendantsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.expandDescendantsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapse method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapse() {
        System.out.println("collapse");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        instance.collapse(treeNodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseAll method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseAll() {
        System.out.println("collapseAll");
        
        Tree instance = new Tree();
        
        instance.collapseAll();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseParent method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseParent() {
        System.out.println("collapseParent");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseParent(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseParentAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseParentAndSelf() {
        System.out.println("collapseParentAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseParentAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseChildren method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseChildren() {
        System.out.println("collapseChildren");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseChildren(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseChildrenAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseChildrenAndSelf() {
        System.out.println("collapseChildrenAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseChildrenAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseAncestors method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseAncestors() {
        System.out.println("collapseAncestors");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseAncestors(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseAncestorsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseAncestorsAndSelf() {
        System.out.println("collapseAncestorsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseAncestorsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseDescendants method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseDescendants() {
        System.out.println("collapseDescendants");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseDescendants(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collapseDescendantsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testCollapseDescendantsAndSelf() {
        System.out.println("collapseDescendantsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.collapseDescendantsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpandedNodes method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testGetExpandedNodes() {
        System.out.println("getExpandedNodes");
        
        Tree instance = new Tree();
        
        Set expResult = null;
        Set result = instance.getExpandedNodes();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExpandListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testAddExpandListener() {
        System.out.println("addExpandListener");
        
        IExpandListener expandListener = null;
        Tree instance = new Tree();
        
        instance.addExpandListener(expandListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeExpandListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testRemoveExpandListener() {
        System.out.println("removeExpandListener");
        
        IExpandListener expandListener = null;
        Tree instance = new Tree();
        
        instance.removeExpandListener(expandListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCollapseListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testAddCollapseListener() {
        System.out.println("addCollapseListener");
        
        ICollapseListener collapseListener = null;
        Tree instance = new Tree();
        
        instance.addCollapseListener(collapseListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCollapseListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testRemoveCollapseListener() {
        System.out.println("removeCollapseListener");
        
        ICollapseListener collapseListener = null;
        Tree instance = new Tree();
        
        instance.removeCollapseListener(collapseListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSelected method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsSelected() {
        System.out.println("isSelected");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isSelected(treeNodeId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelect() {
        System.out.println("select");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        instance.select(treeNodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAll method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectAll() {
        System.out.println("selectAll");
        
        Tree instance = new Tree();
        
        instance.selectAll();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectOnly method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectOnly() {
        System.out.println("selectOnly");
        
        String[] treeNodeIds = null;
        Tree instance = new Tree();
        
        instance.selectOnly(treeNodeIds);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInvisible method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsInvisible() {
        System.out.println("isInvisible");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isInvisible(nodeId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectDescendants method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectDescendants() {
        System.out.println("selectDescendants");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectDescendants(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectDescendantsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectDescendantsAndSelf() {
        System.out.println("selectDescendantsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectDescendantsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectParent method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectParent() {
        System.out.println("selectParent");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectParent(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectParentAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectParentAndSelf() {
        System.out.println("selectParentAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectParentAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAncestors method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectAncestors() {
        System.out.println("selectAncestors");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectAncestors(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAncestorsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectAncestorsAndSelf() {
        System.out.println("selectAncestorsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectAncestorsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectChildren method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectChildren() {
        System.out.println("selectChildren");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectChildren(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectChildrenAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSelectChildrenAndSelf() {
        System.out.println("selectChildrenAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.selectChildrenAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelect method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelect() {
        System.out.println("unSelect");
        
        String treeNodeId = "";
        Tree instance = new Tree();
        
        instance.unSelect(treeNodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectAll method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectAll() {
        System.out.println("unSelectAll");
        
        Tree instance = new Tree();
        
        instance.unSelectAll();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectDescendants method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectDescendants() {
        System.out.println("unSelectDescendants");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectDescendants(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectDescendantsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectDescendantsAndSelf() {
        System.out.println("unSelectDescendantsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectDescendantsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectParent method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectParent() {
        System.out.println("unSelectParent");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectParent(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectParentAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectParentAndSelf() {
        System.out.println("unSelectParentAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectParentAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectAncestors method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectAncestors() {
        System.out.println("unSelectAncestors");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectAncestors(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectAncestorsAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectAncestorsAndSelf() {
        System.out.println("unSelectAncestorsAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectAncestorsAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectChildren method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectChildren() {
        System.out.println("unSelectChildren");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectChildren(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unSelectChildrenAndSelf method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testUnSelectChildrenAndSelf() {
        System.out.println("unSelectChildrenAndSelf");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        instance.unSelectChildrenAndSelf(nodeId);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedNodes method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testGetSelectedNodes() {
        System.out.println("getSelectedNodes");
        
        Tree instance = new Tree();
        
        Set expResult = null;
        Set result = instance.getSelectedNodes();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSingleSelectionMode method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSetSingleSelectionMode() {
        System.out.println("setSingleSelectionMode");
        
        boolean mode = true;
        Tree instance = new Tree();
        
        instance.setSingleSelectionMode(mode);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSingleSelectionMode method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsSingleSelectionMode() {
        System.out.println("isSingleSelectionMode");
        
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isSingleSelectionMode();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPreserveSelectionOfInvisibleNodes method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsPreserveSelectionOfInvisibleNodes() {
        System.out.println("isPreserveSelectionOfInvisibleNodes");
        
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isPreserveSelectionOfInvisibleNodes();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreserveSelectionOfInvisibleNodes method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSetPreserveSelectionOfInvisibleNodes() {
        System.out.println("setPreserveSelectionOfInvisibleNodes");
        
        boolean preserveSelectionOfInvisibleNodes = true;
        Tree instance = new Tree();
        
        instance.setPreserveSelectionOfInvisibleNodes(preserveSelectionOfInvisibleNodes);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSelectListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testAddSelectListener() {
        System.out.println("addSelectListener");
        
        ISelectListener selectListener = null;
        Tree instance = new Tree();
        
        instance.addSelectListener(selectListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSelectListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testRemoveSelectListener() {
        System.out.println("removeSelectListener");
        
        ISelectListener selectListener = null;
        Tree instance = new Tree();
        
        instance.removeSelectListener(selectListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUnSelectListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testAddUnSelectListener() {
        System.out.println("addUnSelectListener");
        
        IUnSelectListener unSelectListener = null;
        Tree instance = new Tree();
        
        instance.addUnSelectListener(unSelectListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUnSelectListener method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testRemoveUnSelectListener() {
        System.out.println("removeUnSelectListener");
        
        IUnSelectListener unSelectListener = null;
        Tree instance = new Tree();
        
        instance.removeUnSelectListener(unSelectListener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIterator() {
        System.out.println("iterator");
        
        boolean includeRootNode = true;
        Tree instance = new Tree();
        
        Iterator expResult = null;
        Iterator result = instance.iterator(includeRootNode);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodePath method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testGetNodePath() {
        System.out.println("getNodePath");
        
        String nodeId = "";
        Tree instance = new Tree();
        
        ITreeNode[] expResult = null;
        ITreeNode[] result = instance.getNodePath(nodeId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilter method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testGetFilter() {
        System.out.println("getFilter");
        
        Tree instance = new Tree();
        
        ITreeFilter expResult = null;
        ITreeFilter result = instance.getFilter();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilter method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSetFilter() {
        System.out.println("setFilter");
        
        ITreeFilter filter = null;
        Tree instance = new Tree();
        
        instance.setFilter(filter);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotifyOnChangeOnly method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testSetNotifyOnChangeOnly() {
        System.out.println("setNotifyOnChangeOnly");
        
        boolean notifyOnChangeOnly = true;
        Tree instance = new Tree();
        
        instance.setNotifyOnChangeOnly(notifyOnChangeOnly);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotifyOnChangeOnly method, of class com.jenkov.prizetags.tree.impl.Tree.
     */
    public void testIsNotifyOnChangeOnly() {
        System.out.println("isNotifyOnChangeOnly");
        
        Tree instance = new Tree();
        
        boolean expResult = true;
        boolean result = instance.isNotifyOnChangeOnly();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
