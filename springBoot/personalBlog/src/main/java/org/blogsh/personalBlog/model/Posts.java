package org.blogsh.personalBlog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_posts")
public class Posts{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(min = 1, max = 255)
	private String postTitle;
	
	@NotNull
	@Size(min = 1, max = 1024)
	private String post;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

    @ManyToOne
    @JsonIgnoreProperties("post")
    private Themes theme;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getPostTitle(){
		return postTitle;
	}

	public void setPostTitle(String postTitle){
		this.postTitle = postTitle;
	}

	public String getPost(){
		return post;
	}

	public void setPost(String post){
		this.post = post;
	}

	public Date getDate(){
		return date;
	}

	public void setDate(Date date){
		this.date = date;
	}

    public Themes getTheme(){
        return theme;
    }

    public void setTheme(Themes theme){
        this.theme = theme;
    }
}
