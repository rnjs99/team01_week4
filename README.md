# group1_tp
실전코딩 1조 github local 저장 확인



===eclipse에서 git 연동===
  1. Git Repositories에서 [Clone Git Repository]를 누른다.
  2. Location의 URI에 자신이 fork한 Git저장소의 주소를 입력한 뒤 [Next]
  3. Destination의 Directory를 설정하고 설치할 branch를 결정한다

<<메이븐 goal로 package 실행 방식>>

===eclipse에서 maven 프로젝트 생성===<br>
git 연동을 한 뒤 maven 프로젝트를 생성하는 법
  1. eclipse에서 git를 연동한 뒤 새 프로젝트를 생성 할 때 [Maven Project]를 생성한다
  2. New Maven Project 에서 Use default Workspace location에 체크를 하여 위치를 정한 뒤 [Next]<br>
  #만약 Maven기반의 Templet을 만들고 싶다면 [Create a simple project]에 체크한다
  3. [Group Id]를 team01 로 설정하였고 [Artifact Id]를 team01.04 으로 설정함
  4. [Pakage]를 jar로 설정하고 [Finish]로 프로젝트를 생성한다.
  5. 생성된 Packge는 git와 연결되어 있지 않으므로 [Team]-[Share Project]-[Git]를 통해 저장소를 설정하고 [Finish]
  6. git와 연결이 되었다면 '>'표시(꺽쇠)가 표시된다.

===이 후 수정한 것을 [commit]과 [push] 하기위한 방법===<br>
파일 옆에 '?'표시가 떠있는 상태라면 git 저장소에 해당 파일이 추가되지 않았다는 의미이다.
   1. [Team]-[Add to Index]
   2. [Team]-[Commit]
   3. [Team]-[Push to Upstream]
