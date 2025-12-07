package com.ruoyi.project.system.zhiyuanxinxi.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.zhiyuanxinxi.domain.Zhiyuanxinxi;
import com.ruoyi.project.system.zhiyuanxinxi.service.IZhiyuanxinxiService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 职员对应表Controller
 * 
 * @author ruoyi
 * @date 2025-12-06
 */
@Controller
@RequestMapping("/zhiyuanxinxi/zhiyuanxinxi")
public class ZhiyuanxinxiController extends BaseController
{
    private String prefix = "zhiyuanxinxi/zhiyuanxinxi";

    @Autowired
    private IZhiyuanxinxiService zhiyuanxinxiService;

    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:view")
    @GetMapping()
    public String zhiyuanxinxi()
    {
        return prefix + "/zhiyuanxinxi";
    }

    /**
     * 查询职员对应表列表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Zhiyuanxinxi zhiyuanxinxi)
    {
        startPage();
        List<Zhiyuanxinxi> list = zhiyuanxinxiService.selectZhiyuanxinxiList(zhiyuanxinxi);
        return getDataTable(list);
    }

    /**
     * 导出职员对应表列表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:export")
    @Log(title = "职员对应表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Zhiyuanxinxi zhiyuanxinxi)
    {
        List<Zhiyuanxinxi> list = zhiyuanxinxiService.selectZhiyuanxinxiList(zhiyuanxinxi);
        ExcelUtil<Zhiyuanxinxi> util = new ExcelUtil<Zhiyuanxinxi>(Zhiyuanxinxi.class);
        return util.exportExcel(list, "职员对应表数据");
    }

    /**
     * 新增职员对应表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存职员对应表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:add")
    @Log(title = "职员对应表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Zhiyuanxinxi zhiyuanxinxi)
    {
        return toAjax(zhiyuanxinxiService.insertZhiyuanxinxi(zhiyuanxinxi));
    }

    /**
     * 修改职员对应表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:edit")
    @GetMapping("/edit/{idzhiyuanxinxi}")
    public String edit(@PathVariable("idzhiyuanxinxi") Long idzhiyuanxinxi, ModelMap mmap)
    {
        Zhiyuanxinxi zhiyuanxinxi = zhiyuanxinxiService.selectZhiyuanxinxiByIdzhiyuanxinxi(idzhiyuanxinxi);
        mmap.put("zhiyuanxinxi", zhiyuanxinxi);
        return prefix + "/edit";
    }

    /**
     * 修改保存职员对应表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:edit")
    @Log(title = "职员对应表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Zhiyuanxinxi zhiyuanxinxi)
    {
        return toAjax(zhiyuanxinxiService.updateZhiyuanxinxi(zhiyuanxinxi));
    }

    /**
     * 删除职员对应表
     */
    @RequiresPermissions("zhiyuanxinxi:zhiyuanxinxi:remove")
    @Log(title = "职员对应表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zhiyuanxinxiService.deleteZhiyuanxinxiByIdzhiyuanxinxis(ids));
    }
}
