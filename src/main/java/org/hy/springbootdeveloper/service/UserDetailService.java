package org.hy.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.hy.springbootdeveloper.domain.User;
import org.hy.springbootdeveloper.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
 */
@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    // 사용자 이름(email)으로 사용자 정보 가져오는 메서드
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }
}
