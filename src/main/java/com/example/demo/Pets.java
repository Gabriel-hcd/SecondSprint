package com.example.demo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Pets implements Serializable{
	
	private int id;
	private String type;
	private float price;
	
}
