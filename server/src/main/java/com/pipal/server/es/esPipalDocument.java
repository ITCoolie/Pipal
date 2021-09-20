package com.pipal.server.es;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "pipal_document", createIndex = true)
public class esPipalDocument implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.Keyword)
    private String keywords;

    @Field(type = FieldType.Text)
    private String desc;
}