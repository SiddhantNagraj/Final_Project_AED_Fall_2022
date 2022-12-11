/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personpkg;

/**
 *
 * @author Siddhant
 */
public class Testimonial {
    
    private static int count=0;
    private int testiID;
    private String testiText;
    private String wName;
    private String date;
    
    public Testimonial()
    {
        count++;
       testiID = count;
    }

    public int getTestimonialID() {
        return testiID;
    }


    public String getTestimonialTxt() {
        return testiText;
    }

    public void setTestimonialTxt(String testiText) {
        this.testiText = testiText;
    }

    public String getWriterName() {
        return wName;
    }

    public void setWriterName(String wName) {
        this.wName = wName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.testiID);
    }
    
    
    
}
