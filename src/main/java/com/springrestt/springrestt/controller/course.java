package com.springrestt.springrestt.controller;

public class course {
    private long id;
    private String title;
    private String description;
    public course(long id, String title, String description){
        super();
        this.id=id;
        this.title=title;
        this.description=description;

    }
    public course(){
        super();
    }
    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "course [id=" + id + ", title=" + title + ", description=" + description + "]";
    }
    
}