package com.pipal.server.es;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface esDocumentTemplate extends ElasticsearchRepository<esPipalDocument, String> {
}