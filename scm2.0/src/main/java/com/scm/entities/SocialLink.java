package com.scm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialLink {

  @Id
  private String id;
  private String link;
  private String title;

  @ManyToOne
  private Contact contact;
}
