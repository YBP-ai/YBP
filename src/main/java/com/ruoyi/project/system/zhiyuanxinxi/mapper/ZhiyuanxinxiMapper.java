package com.ruoyi.project.system.zhiyuanxinxi.mapper;

import java.util.List;
import com.ruoyi.project.system.zhiyuanxinxi.domain.Zhiyuanxinxi;

/**
 * 职员对应表Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-06
 */
public interface ZhiyuanxinxiMapper 
{
    /**
     * 查询职员对应表
     * 
     * @param idzhiyuanxinxi 职员对应表主键
     * @return 职员对应表
     */
    public Zhiyuanxinxi selectZhiyuanxinxiByIdzhiyuanxinxi(Long idzhiyuanxinxi);

    /**
     * 查询职员对应表列表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 职员对应表集合
     */
    public List<Zhiyuanxinxi> selectZhiyuanxinxiList(Zhiyuanxinxi zhiyuanxinxi);

    /**
     * 新增职员对应表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 结果
     */
    public int insertZhiyuanxinxi(Zhiyuanxinxi zhiyuanxinxi);

    /**
     * 修改职员对应表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 结果
     */
    public int updateZhiyuanxinxi(Zhiyuanxinxi zhiyuanxinxi);

    /**
     * 删除职员对应表
     * 
     * @param idzhiyuanxinxi 职员对应表主键
     * @return 结果
     */
    public int deleteZhiyuanxinxiByIdzhiyuanxinxi(Long idzhiyuanxinxi);

    /**
     * 批量删除职员对应表
     * 
     * @param idzhiyuanxinxis 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteZhiyuanxinxiByIdzhiyuanxinxis(String[] idzhiyuanxinxis);
}
