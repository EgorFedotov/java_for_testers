package model;

import java.awt.*;

public record GroupData(String name, String header, String footer) {

    public GroupData(){
        this("", "", "");
    }

    public GroupData withName(String name) {
        return new GroupData(name, this.header, this.footer);
    }

    public GroupData withHeader(String name) {

        return new GroupData(this.name, header, this.footer);
    }

    public GroupData withFooter(String name) {

        return new GroupData(this.name, this.header, footer);
    }
}
