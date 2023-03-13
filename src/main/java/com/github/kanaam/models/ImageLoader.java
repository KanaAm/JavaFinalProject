package com.github.kanaam.models;

import javax.swing.*;
import java.util.HashMap;

public class ImageLoader {
    private final HashMap<String, ImageIcon> map = new HashMap<>();
    public void load(){
        map.put("blue lock",new ImageIcon(this.getClass().getResource("/blue lock.png")));
        map.put("domestic na kanojo",new ImageIcon(this.getClass().getResource("/domesticnakanojo.png")));
        map.put("kaifuku jutsushi no yarinaoshi",new ImageIcon(this.getClass().getResource("/kaifuku jutsushi no yarinaoshi.png")));
        map.put("higurashi",new ImageIcon(this.getClass().getResource("/higurashi.png")));
        map.put("horimiya",new ImageIcon(this.getClass().getResource("/horimiya.png")));
        map.put("kagenou minoru",new ImageIcon(this.getClass().getResource("/kagenou minoru.png")));
        map.put("jojo's bizarre adventure",new ImageIcon(this.getClass().getResource("/jojo.png")));
        map.put("konosuba",new ImageIcon(this.getClass().getResource("/konosuba.png")));

    }
    public  ImageIcon getImage(String name){
        return map.get(name);
    }
}
