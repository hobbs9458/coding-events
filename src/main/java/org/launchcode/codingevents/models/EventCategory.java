package org.launchcode.codingevents.models;

import org.dom4j.tree.AbstractEntity;
import org.launchcode.codingevents.data.EventCategoryRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message="You must provide a name")
    @Size(min=1, max=30)
    private String name;

    public EventCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EventCategory() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
