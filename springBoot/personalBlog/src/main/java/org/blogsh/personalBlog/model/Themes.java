package org.blogsh.personalBlog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_themes")
public class Themes{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 255)
    private String description;

    @OneToMany(mappedBy = "theme", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("theme")
    private List<Posts> post;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<Posts> getPost(){
        return post;
    }

    public void setPost(List<Posts> post){
        this.post = post;
    }
}
