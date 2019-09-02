
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
@ManagedBean
public class Book implements Serializable {
     
    private String title;
    private String author;
    private String descripcion;
    private Integer integer;
    private String publisher;
    private Integer pages;
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public String getPublisher() {
        return publisher;
    }
 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
 
    public Integer getPages() {
        return pages;
    }
 
    public void setPages(Integer pages) {
        this.pages = pages;
    }
 private String productId; 
 
    public String getProductId() {
        return productId;
    }
 
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public List<String> completeArea(String query) {
        List<String> results = new ArrayList<String>();
         
        if(query.equals("PrimeFaces")) {
            results.add("PrimeFaces Rocks!!!");
            results.add("PrimeFaces has 100+ components.");
            results.add("PrimeFaces is lightweight.");
            results.add("PrimeFaces is easy to use.");
            results.add("PrimeFaces is developed with passion!");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
    
    public boolean equals(Object obj) {
        if(!(obj instanceof Book))
            return false;
         
        Book book = (Book) obj;
         
        return (book.getTitle() != null && book.getTitle().equals(title)) && (book.getAuthor() != null && book.getAuthor().equals(author))&& (book.getDescripcion() != null && book.getDescripcion().equals(descripcion));
    }
 
    public int hashCode() {
        int hash = 1;
        if(title != null)
            hash = hash * 31 + title.hashCode();
         
        if(author != null)
            hash = hash * 29 + author.hashCode();
        
        if(descripcion != null)
            hash = hash * 30 + descripcion.hashCode();
        
        return hash;
    }
       @ViewScoped
   private int number; 
   
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}

