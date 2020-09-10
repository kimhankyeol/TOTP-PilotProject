# OTP-PilotProject
OTP 파일럿 프로젝트


## 개발 환경
IDE : IntellJ
Framework : Spring

## 개발 기간
2020-09-07 ~ 2020-09-11

## 개요 
1. ID , PW로 1차 로그인 진행
2. 로그인 되면 ID와 Gauth 를 통해 QR코드를 만들어 웹 화면 출력함
3. 출력된 QR코드를 GOTP 앱을 통해 스캔한후 OTP 코드를 발급받음
4. 발급된 OTP 코드를 입력하면 2차 로그인 완료

## 추후 개발 
지금은 화면이동없이 css로 간단하게만 화면처리함<br>
다른 파일럿 프로젝트를 연동한다면 그떄는 화면을 수정할 예정임<br>
다음 프로젝트는 프론트 쪽에서는 webrtc 백에서는 Redis+socket.io+node+express로 화상회의를 구현해볼 
