package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.User;

public interface UserDaoImpl {
    int deleteUser(String id) throws Exception;

    User selectUser(String id) throws Exception;

    // 사용자 정보를 user_info테이블에 저장하는 메서드
    int insertUser(User user) throws Exception;

    int updateUser(User user) throws Exception;

    int count() throws Exception;

    void deleteAll() throws Exception;
}
