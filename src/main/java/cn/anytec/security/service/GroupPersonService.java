package cn.anytec.security.service;

import cn.anytec.security.common.ServerResponse;
import cn.anytec.security.model.TbGroupPerson;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GroupPersonService {
    TbGroupPerson getPersonGroupInfo(Integer personGroupId);
    ServerResponse add(TbGroupPerson groupPerson);
    ServerResponse<String> delete(String groupPersonIds);
    ServerResponse update(TbGroupPerson groupPerson);
    ServerResponse<PageInfo> list(Integer pageNum, Integer pageSize,String groupName);
    List<TbGroupPerson> allList();
    ServerResponse<TbGroupPerson> getGroupPersonById(String personGroupId);
    boolean isPersonGroupNameExist(String personGroupName);

}
