package com.zeal.zealsay.common.entity;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * 分页封装.
 *
 * @author zhanglei
 * @date 2018/9/20  下午8:40
 */
@Data
@Builder
@AllArgsConstructor
@ApiModel(value="Role对象", description="")
public class PageInfo<T> {

  public static final Long DEFAULT_PAGE_SIZE = 10L;
  public static final Long DEFAULT_PAGE_NUMBER = 1L;

  @ApiModelProperty(value = "pageSize",example = "页面大小")
  private Long pageSize;
  @ApiModelProperty(value = "currentPage",example = "当前页面")
  private Long currentPage;
  @ApiModelProperty(value = "total",example = "总页面数")
  private Long total;

  @Builder.Default
  private List<T> records = Collections.emptyList();

  /**
   * 构造器.
   *
   * @author zhanglei
   * @date 2018/9/21  上午10:50
   */
  public PageInfo(Page<T> page) {
    this.currentPage = page.getCurrent();
    this.pageSize = page.getSize();
    this.total = page.getTotal();
    this.records = page.getRecords();
  }

  /**
   * 构造器.
   *
   * @author zhanglei
   * @date 2018/9/21  下午5:20
   */
  public PageInfo(Long currentPage, Long pageSize) {
    if (null != currentPage) {
      this.currentPage = currentPage;
    } else {
      this.currentPage = DEFAULT_PAGE_NUMBER;
    }
    if (null != pageSize) {
      this.pageSize = pageSize;
    } else {
      this.pageSize = DEFAULT_PAGE_SIZE;
    }
  }
}
