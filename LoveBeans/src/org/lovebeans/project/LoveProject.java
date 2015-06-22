/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lovebeans.project;

import java.awt.Image;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.CustomizerProvider;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;
/**
 *
 * @author Alexandre
 */
public class LoveProject implements Project {
    
    private final FileObject projectDir;
    private final ProjectState state;
    private Lookup lkp;
    
    LoveProject(FileObject dir, ProjectState state) {
        this.projectDir = dir;
        this.state = state;
    }
    
    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }
    
    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[] {
               
                //register your features here
                this,
                new Info(),
                new LoveProjectLogicalView(this),
                new LoveCustomizerProvider(this),
                
            });
        }
        return lkp;
    }
    
    private final class Info implements ProjectInformation {
        
        @StaticResource()
        public static final String LOVE_ICON = "org/lovebeans/project/icon.png";
        
        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(LOVE_ICON));
        }
        
        @Override
        public String getName() {
            return getProjectDirectory().getName();
        }
        
        @Override
        public String getDisplayName() {
            return getName();
        }
        
        @Override
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        @Override
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        @Override
        public Project getProject() {
            return LoveProject.this;
        }
        
    }
    
    class LoveProjectLogicalView implements LogicalViewProvider {
        
        @StaticResource
        public static final String LOVE_ICON = "org/lovebeans/project/icon.png";
        
        private final LoveProject project;
        
        public LoveProjectLogicalView(LoveProject project) {
            this.project = project;
        }
        
        @Override
        public Node createLogicalView() {
            try {
                //Obtain the project directory's node:
                FileObject projectDirectory = project.getProjectDirectory();
                DataFolder projectFolder = DataFolder.findFolder(projectDirectory);
                Node nodeOfProjectFolder = projectFolder.getNodeDelegate();
                //Decorate the project directory's node:
                return new ProjectNode(nodeOfProjectFolder, project);
            } catch (DataObjectNotFoundException donfe) {
                Exceptions.printStackTrace(donfe);
                //Fallback-the directory couldn't be created -
                //read-only filesystem or something evil happened
                return new AbstractNode(Children.LEAF);
            }
        }
        
        private final class ProjectNode extends FilterNode {
            
            final LoveProject project;
            
            public ProjectNode(Node node, LoveProject project) throws DataObjectNotFoundException {
                super(node, 
                        new FilterNode.Children(node),
                        new ProxyLookup(
                        new Lookup[]{
                            Lookups.singleton(project),
                            node.getLookup()
                        }));
                this.project = project;
            }
            
            @Override
            public Action[] getActions(boolean arg0) {
                return new Action[]{
                    CommonProjectActions.newFileAction(),
                    CommonProjectActions.copyProjectAction(),
                    CommonProjectActions.deleteProjectAction(),
                    CommonProjectActions.customizeProjectAction(),
                    CommonProjectActions.closeProjectAction()
                };
            }
            
            @Override
            public Image getIcon(int type) {
                return ImageUtilities.loadImage(LOVE_ICON);
            }
            
            @Override
            public Image getOpenedIcon(int type) {
                return getIcon(type);
            }
            
            @Override
            public String getDisplayName() {
                return project.getProjectDirectory().getName();
            }
            
        }
        
        @Override
        public Node findPath(Node root, Object target) {
            // leave unimplemented for now
            return null;
        }
        
    }
}
