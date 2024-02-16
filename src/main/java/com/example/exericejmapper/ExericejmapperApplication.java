package com.example.exericejmapper;

import com.googlecode.jmapper.xml.beans.XmlJmapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.NoTypePermission;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExericejmapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExericejmapperApplication.class, args);
    }

}
