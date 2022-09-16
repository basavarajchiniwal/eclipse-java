package com.xworkz.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {
	private int id;
	private String name;
	private double budget;
	private String[] producerNames;
	private String[] actors;
	private String types;
	private String grade;
	private Boolean hit;
	private Boolean flop;
	private Boolean superHit;
	private Integer profit;
	private String running;
	private String asstCameraMen;
	private String scenes;
	private Double duration;
	
	

	public MovieDTO() {

	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", budget=" + budget + ", producerNames="
				+ Arrays.toString(producerNames) + ", actors=" + Arrays.toString(actors) + "]";
	}

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

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String[] getProducerNames() {
		return producerNames;
	}

	public void setProducerNames(String[] producerNames) {
		this.producerNames = producerNames;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Boolean getHit() {
		return hit;
	}

	public void setHit(Boolean hit) {
		this.hit = hit;
	}

	public Boolean getFlop() {
		return flop;
	}

	public void setFlop(Boolean flop) {
		this.flop = flop;
	}

	public Boolean getSuperHit() {
		return superHit;
	}

	public void setSuperHit(Boolean superHit) {
		this.superHit = superHit;
	}

	public Integer getProfit() {
		return profit;
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}

	public String getRunning() {
		return running;
	}

	public void setRunning(String running) {
		this.running = running;
	}

	public String getAsstCameraMen() {
		return asstCameraMen;
	}

	public void setAsstCameraMen(String asstCameraMen) {
		this.asstCameraMen = asstCameraMen;
	}

	public String getScenes() {
		return scenes;
	}

	public void setScenes(String scenes) {
		this.scenes = scenes;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	
}
