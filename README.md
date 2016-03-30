# group1_tp
실전코딩 1조 github local 저장 확인
<<eclips에서 git 연동>>
1.
<<메이븐 goal로 package 실행 방식>>

===eclips에서 maven 프로젝트 생성===

1. 이클립스에서 git 저장소를 clone한다.
2. 새 프로젝트를 생성 할 때 [Marven Project]를 생성
3. New Maven Project 에서 Use default Workspace location에 위치를 잡는다.
4. Version 1.1 로 설정
5. Group Id를 team01 로 설정하고 Artifact Id를 team01.04 으로 설정
6. Pakage를 jar로 설정하고 [Finish]
7. 생성된 Packge는 git와 연결되어 있지 않으므로 [Team]-[Share Project]-[Git]를 통해 저장소를 설정하고 [Finish]

===이 후 수정한 것을 [commit]과 [push] 하기위한 방법===
 1. [Team]-[Add to Index]
 2. [Team]-[Commit]
 3. [Team]-[Push to Upstream]
