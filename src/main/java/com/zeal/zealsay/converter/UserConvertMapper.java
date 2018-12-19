package com.zeal.zealsay.converter;

import com.zeal.zealsay.dto.request.UserAddRequest;
import com.zeal.zealsay.dto.request.UserPageRequest;
import com.zeal.zealsay.dto.request.UserUpdateRequest;
import com.zeal.zealsay.dto.response.UserResponse;
import com.zeal.zealsay.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * user相关转换器.
 *
 * @author  zhanglei
 * @date 2018/11/15  5:43 PM
 */
@Mapper(componentModel = "spring")
public interface UserConvertMapper {

  UserResponse toUserResponse(User user);

  User toUser(UserUpdateRequest userUpdateRequest);

  User toUser(UserAddRequest userAddRequest);

  User toUser(UserPageRequest userPageRequest);

}
