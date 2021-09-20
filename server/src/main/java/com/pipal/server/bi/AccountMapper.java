package com.pipal.server.bi;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("SELECT * FROM db_pipal.tb_account;")
    List<TbAccount> select();
}