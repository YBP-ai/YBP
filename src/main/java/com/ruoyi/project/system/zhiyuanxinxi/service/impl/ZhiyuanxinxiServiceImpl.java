package com.ruoyi.project.system.zhiyuanxinxi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.zhiyuanxinxi.mapper.ZhiyuanxinxiMapper;
import com.ruoyi.project.system.zhiyuanxinxi.domain.Zhiyuanxinxi;
import com.ruoyi.project.system.zhiyuanxinxi.service.IZhiyuanxinxiService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 职员对应表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-06
 */
@Service
public class ZhiyuanxinxiServiceImpl implements IZhiyuanxinxiService 
{
    @Autowired
    private ZhiyuanxinxiMapper zhiyuanxinxiMapper;

    /**
     * 查询职员对应表
     * 
     * @param idzhiyuanxinxi 职员对应表主键
     * @return 职员对应表
     */
    @Override
    public Zhiyuanxinxi selectZhiyuanxinxiByIdzhiyuanxinxi(Long idzhiyuanxinxi)
    {
        return zhiyuanxinxiMapper.selectZhiyuanxinxiByIdzhiyuanxinxi(idzhiyuanxinxi);
    }

    /**
     * 查询职员对应表列表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 职员对应表
     */
    @Override
    public List<Zhiyuanxinxi> selectZhiyuanxinxiList(Zhiyuanxinxi zhiyuanxinxi)
    {
        return zhiyuanxinxiMapper.selectZhiyuanxinxiList(zhiyuanxinxi);
    }

    /**
     * 新增职员对应表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 结果
     */
    @Override
    public int insertZhiyuanxinxi(Zhiyuanxinxi zhiyuanxinxi)
    {
        return zhiyuanxinxiMapper.insertZhiyuanxinxi(zhiyuanxinxi);
    }

    /**
     * 修改职员对应表
     * 
     * @param zhiyuanxinxi 职员对应表
     * @return 结果
     */
    @Override
    public int updateZhiyuanxinxi(Zhiyuanxinxi zhiyuanxinxi)
    {
        return zhiyuanxinxiMapper.updateZhiyuanxinxi(zhiyuanxinxi);
    }

    /**
     * 批量删除职员对应表
     * 
     * @param idzhiyuanxinxis 需要删除的职员对应表主键
     * @return 结果
     */
    @Override
    public int deleteZhiyuanxinxiByIdzhiyuanxinxis(String idzhiyuanxinxis)
    {
        return zhiyuanxinxiMapper.deleteZhiyuanxinxiByIdzhiyuanxinxis(Convert.toStrArray(idzhiyuanxinxis));
    }

    /**
     * 删除职员对应表信息
     * 
     * @param idzhiyuanxinxi 职员对应表主键
     * @return 结果
     */
    @Override
    public int deleteZhiyuanxinxiByIdzhiyuanxinxi(Long idzhiyuanxinxi)
    {
        return zhiyuanxinxiMapper.deleteZhiyuanxinxiByIdzhiyuanxinxi(idzhiyuanxinxi);
    }
}
