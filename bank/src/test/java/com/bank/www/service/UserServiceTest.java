package com.bank.www.service;

import com.bank.www.config.dummy.DummyObject;
import com.bank.www.domain.user.User;
import com.bank.www.domain.user.UserRepository;
import com.bank.www.dto.user.UserRespDto.JoinRespDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static com.bank.www.dto.user.UserReqDto.JoinReqDto;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest extends DummyObject {
    @InjectMocks private UserService userService;
    @Mock private UserRepository userRepository;
    @Spy private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void 회원가입_test() throws Exception {
        // given
        JoinReqDto joinReqDto = new JoinReqDto();
        joinReqDto.setUsername("ssar");
        joinReqDto.setPassword("1234");
        joinReqDto.setEmail("ssar@nate.com");
        joinReqDto.setFullname("쌀");

        // stub 1
        when(userRepository.findByUsername(any())).thenReturn(Optional.empty());

        // stub 2
//        User ssar = User.builder()
//                        .id(1L)
//                        .username("ssar")
//                        .password("1234")
//                        .email("ssar@nate.com")
//                        .fullname("쌀")
//                        .role(UserEnum.CUSTOMER)
//                        .createdAt(LocalDateTime.now())
//                        .updatedAt(LocalDateTime.now())
//                        .build();
        User ssar = newMockUser(1L, "ssar", "쌀");
        when(userRepository.save(any())).thenReturn(ssar);
//        when(userRepository.findByUsername(any())).thenReturn(Optional.of(new User())); // 오류

        // when
        JoinRespDto joinRespDto = userService.회원가입(joinReqDto);
        System.out.println("테스트: " + joinRespDto);

        // then
        assertThat(joinRespDto.getId()).isEqualTo(1L);
        assertThat(joinRespDto.getUsername()).isEqualTo("ssar");
    }
}
