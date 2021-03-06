package com.cmdbms.service;

import com.cmdbms.model.Affichenotice;

import java.util.List;

public interface AfficheSer {
    List selectNotice(Integer notStatetype);

    List selectNoticetwo(String  notWriter);

    String insertNotice(Affichenotice affichenotice);

    String updateNotice(Integer notId, String notType, String notContent,String notWriter, String notReleaser, Integer notState, Integer notStatetype);

    int deleteNotice(Integer notId);

    String insertCom(Integer userComId,Integer notId,Integer userId,String userComCon);

    int deleteCom(Integer userComId);

    List selectCom(Integer notId);
}
