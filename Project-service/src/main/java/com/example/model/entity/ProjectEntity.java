package com.example.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private Integer leadId;

    @Column
    private String tint;

    @Column
    private Integer workSpaceId;

    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getLeadId() {return this.leadId;}

    public void setLeadId(Integer leadId) {this.leadId = leadId;}

    public String getTint() {return this.tint;}

    public void setTint(String tint) {this.tint = tint;}

    public Integer getWorkSpaceId() {return this.workSpaceId;}

    public void setWorkSpaceId(Integer workSpaceId) {this.workSpaceId = workSpaceId;}


}
