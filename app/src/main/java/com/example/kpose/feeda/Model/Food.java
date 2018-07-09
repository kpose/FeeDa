package com.example.kpose.feeda.Model;

public class Food {
    private  String Name1,Image,description,menuId,price;

    public Food() {
    }

    public Food(String name1, String image, String description, String menuId, String price) {
        Name1 = name1;
        Image = image;
        this.description = description;
        this.menuId = menuId;
        this.price = price;
    }

    public String getName1() {
        return Name1;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
