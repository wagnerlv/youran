package com.youran.generate.help;


import com.youran.generate.pojo.dto.MetaConstDetailAddDTO;
import com.youran.generate.pojo.dto.MetaConstDetailUpdateDTO;
import com.youran.generate.pojo.po.MetaConstDetailPO;

import static com.youran.generate.pojo.example.MetaConstDetailExample.*;

/**
 * 测试数据
 *
 * @author: cbb
 * @date: 2017/5/12
 */
public class MetaConstDetailHelper {

    /**
     * 生成add测试数据
     *
     * @return
     */
    public static MetaConstDetailAddDTO getAddDTO(Integer constId) {
        MetaConstDetailAddDTO dto = new MetaConstDetailAddDTO();
        dto.setConstId(constId);
        dto.setDetailName(E_DETAILNAME);
        dto.setDetailValue(E_DETAILVALUE);
        dto.setDetailRemark(E_DETAILREMARK);

        return dto;
    }


    /**
     * 生成update测试数据
     *
     * @return
     */
    public static MetaConstDetailUpdateDTO getUpdateDTO(MetaConstDetailPO metaConstDetail) {
        MetaConstDetailUpdateDTO dto = new MetaConstDetailUpdateDTO();
        dto.setConstDetailId(metaConstDetail.getConstDetailId());
        dto.setConstId(metaConstDetail.getConstId());
        dto.setDetailName(metaConstDetail.getDetailName() + "1");
        dto.setDetailValue(metaConstDetail.getDetailValue() + "1");
        dto.setDetailRemark(metaConstDetail.getDetailRemark() + "1");
        return dto;

    }

}
