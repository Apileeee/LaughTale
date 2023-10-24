package com.example.laughtale;

public class CoffeeMenu {
    private String menuTitle;
    private String price;
    private int imageResource;

    public CoffeeMenu(String menuTitle, String price, int imageResource) {
        this.menuTitle = menuTitle;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}



