package com.cg.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement
public class Message {

    private String text;
    private Date date;
    
    public Message(String text) {
        super();
        this.text = text;
        this.date = new Date();
    }
    public Message() { }
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Message(String text, Date date) {
		super();
		this.text = text;
		this.date = date;
	}
    
    
}