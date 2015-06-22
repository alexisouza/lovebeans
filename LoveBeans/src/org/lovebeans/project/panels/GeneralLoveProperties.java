/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lovebeans.project.panels;

/**
 *
 * @author Alexandre
 */
import javax.swing.JComponent; 
import javax.swing.JPanel; 
import org.netbeans.spi.project.ui.support.ProjectCustomizer; 
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category; 
import org.openide.util.Lookup; 
import org.openide.util.NbBundle;

public class GeneralLoveProperties implements ProjectCustomizer.CompositeCategoryProvider {
    
    private static final String GENERAL = "General";
    
    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-lovebeans-project", position = 10)
    public static GeneralLoveProperties createGeneral() {
        return new GeneralLoveProperties();
    }
    
    @NbBundle.Messages("LBL_Config_General=General")
    @Override
    public Category createCategory(Lookup lkp) {
        return ProjectCustomizer.Category.create(
            GENERAL,
            Bundle.LBL_Config_General(),
            null);
    }
    
    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        return new JPanel();
    }
    
}
