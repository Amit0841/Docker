package com.masai.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Chat {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int chatId;
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private Users user;
private String message;
}
