package com.zeal.zealsay.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleUpdateRequest {

  /**
   * id.
   */
  @NotBlank(message = "id不能为空")
  private Long id;

  /**
   * 角色名称.
   */
  private String name;

  /**
   * 角色值.
   */
  private String value;

  /**
   * 描述.
   */
  private String description;

}
