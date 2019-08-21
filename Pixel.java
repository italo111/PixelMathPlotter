/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author OWNER
 */
public class Pixel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int width = 1000;
        int height = 1000;
        BufferedImage img = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB );
        File f = null;
        int temp;
        int p;
        int r,g,b;
        for(int y = 0; y <height ;y++ ){
            for(int x =0; x <width; x++){
                int a = 250;
                   r = 0;
                   g = 0;
                   b = 0;
                  p = (a<<24)|(r<<16)|(g<<8)|b;
                  img.setRGB(x,y,p);
            }
        }
        for(int y = 0; y <height ;y++ ){
            for(int x =0; x <width; x++){
                 int a = 250;
                   r = 0;
                   g = 0;
                  b = 0;
                  double d = x/40.0;
                  int num = (int)(1000-((d*d)*(Math.sin(d)))-500);
                  
                  if((y == num)&&(num>0)){
                      r = 0;
                      g= 255;
                      b = 0;
                       
                  }
                 temp = x;//multiplier
                 p = (a<<24)|(r<<16)|(g<<8)|b;

                 
                  if(temp>950){
                      temp = 245;
                 }
                
                
                  img.setRGB(temp,y,p);
                  //img.setRGB(x,y,p);
                  
            }
        }
       try{
           f = new File("Output.png");
           ImageIO.write(img,"png", f);
       } catch(IOException e){
           System.out.println("error"+e);
       }
      
    }
    
}
