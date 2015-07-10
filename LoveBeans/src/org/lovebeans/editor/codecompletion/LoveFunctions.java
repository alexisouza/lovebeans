/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lovebeans.editor.codecompletion;

/**
 *
 * @author Alexandre
 */
public class LoveFunctions {
    
    private static final String[] loveFunctions = {
        
        "love.draw()",
        "love.errhand(msg)",
        "love.focus(f)",
        "love.keypressed(key, isrepeat)",
        "love.keyreleased(key)",
        "love.load(arg)",
        "love.mousefocus(f)",
        "love.mousemoved(x, y, dx, dy)",
        "love.mousepressed(x, y, button)",
        "love.mousereleased(x, y, button)",
        "love.quit()",
        "love.resize(w, h)",
        "love.run()",
        "love.textinput(text)",
        "love.threaderror(thread, errorstr)",
        "love.update(dt)",
        "love.visible(v)",
        

    };
    
    public static String[] getFunctions() {
        return loveFunctions;
        
    }
    
}
