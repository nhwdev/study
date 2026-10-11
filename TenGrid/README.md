# 🎮 TEN GRID

> **합이 10이 되는 숫자를 연결하는 웹 퍼즐 게임**입니다.  
> 10 × 10 보드에서 숫자를 드래그해 지우고, 60초 동안 최대한 높은 점수를 기록하세요.

### ▶️ [게임 바로 플레이하기](https://nhwdev.github.io/study/)

<br>

## 🛠 Tech Stack

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![GitHub Pages](https://img.shields.io/badge/GitHub_Pages-222222?style=for-the-badge&logo=github&logoColor=white)

| 영역 | 구성 |
|------|------|
| 화면 | HTML5, CSS Grid, Flexbox, CSS 애니메이션 |
| 게임 로직 | Vanilla JavaScript, DOM 이벤트, 2차원 배열 |
| 배포 | GitHub Pages |

HTML·CSS·JavaScript를 하나의 `index.html`에 담았습니다. 별도 라이브러리, 서버, 패키지 설치 없이 브라우저에서 실행됩니다.

<br>

## 🕹️ 게임 방법

1. **게임 시작** 버튼을 누르면 1~9의 숫자로 채워진 10 × 10 보드가 생성됩니다.
2. 숫자가 있는 칸에서 마우스 버튼을 누르고, **상하좌우로 인접한 칸**을 따라 드래그합니다.
3. 선택한 숫자의 합이 **정확히 10**이 되면 마우스 버튼을 놓습니다.
4. 숫자가 지워지고, **지운 숫자 칸 하나당 10점**을 얻습니다.
5. 60초가 지나면 최종 점수와 지운 칸 수가 표시됩니다. 다시 시작하면 새로운 보드가 생성됩니다.

### 📏 선택 규칙

- 대각선 이동이나 칸을 건너뛰는 이동은 선택되지 않습니다.
- 같은 드래그에서 이미 선택한 칸은 다시 선택할 수 없습니다.
- 빈 칸에서 드래그를 시작할 수 없습니다. **숫자 칸에서 시작하세요.**
- 드래그 중에는 빈 칸을 통과할 수 있습니다. 빈 칸은 합계와 점수에 포함되지 않습니다.
- 합이 10이 아니면 숫자는 그대로 남고 선택 표시만 해제됩니다.
- 보드 밖으로 마우스를 이동해도 현재 선택으로 드래그가 종료됩니다.
- 지워진 칸은 빈 칸으로 유지되며, 게임 중 새 숫자가 채워지지는 않습니다.

예를 들어 `2 → 3 → 5`를 연결하면 합이 10이고 숫자 3칸이 지워져 **30점**을 얻습니다. 경로에 빈 칸이 포함돼도 점수는 지운 숫자 칸 수로 계산합니다.

<br>

## ⚙️ 주요 기능

| 기능 | 구현 내용 |
|------|-----------|
| 🔢 랜덤 보드 | 매 게임 1~9의 숫자로 구성된 100칸 생성 |
| 🖱️ 드래그 선택 | 마우스 이벤트로 경로 추적, 인접 여부·중복 선택 검사 |
| 🟠 선택 피드백 | 선택한 숫자 칸을 주황색으로 강조 |
| ✨ 합계 판정 | 합이 10인 경로의 숫자를 제거하고 빈 칸으로 표시 |
| 🏆 점수 계산 | 지운 숫자 칸 수 × 10점, 누적 점수 표시 |
| ⏱️ 타이머 | 60초 카운트다운과 남은 시간 진행 바 |
| 🚨 시간 경고 | 10초 이하일 때 빨간색 타이머와 깜빡임 효과 |
| 📊 결과 화면 | 최종 점수와 지운 칸 수 표시 |
| 🔄 재시작 | 점수·보드·시간·선택 상태 초기화 |

현재 조작은 마우스 이벤트를 기준으로 구현되어 있습니다. 점수는 현재 게임 동안 메모리에 보관됩니다.

<br>

## 📂 폴더 구조

```text
TenGrid/
├── index.html   # 게임 화면, 스타일, 게임 로직
└── README.md    # 게임 소개와 실행 안내
```

<br>

## 🧠 핵심 로직

| 함수 | 역할 |
|------|------|
| `createBoard()` | 10 × 10의 2차원 배열에 랜덤 숫자 생성 |
| `render()` | 보드 상태를 숫자 칸·빈 칸으로 렌더링 |
| `addEvents()` | 마우스 누름·셀 진입·버튼 해제·보드 이탈 이벤트 연결 |
| `startDrag()` | 시작 좌표와 첫 숫자를 기록 |
| `dragging()` | 인접 여부·중복 여부 검사 후 경로와 합계 갱신 |
| `endDrag()` | 합계 10 판정, 숫자 제거, 점수·제거 칸 수 갱신 |
| `startTimer()` / `resetTimer()` | 카운트다운 시작 및 타이머 초기화 |
| `endGame()` / `startGame()` | 결과 화면 표시 및 새 게임 시작 |

`board[r][c]`에 각 칸의 숫자를 저장하고, 지워진 칸은 `0`으로 표시합니다. 드래그 경로는 `selected` 배열로 관리하며, 마지막 선택 좌표와 현재 좌표의 차이로 상하좌우 인접 여부를 판단합니다.

<br>

## 📖 학습 포인트

| 주제 | 핵심 개념 |
|------|-----------|
| 화면 배치 | CSS Grid로 게임 보드 구성, Flexbox로 셀 내용 정렬 |
| 상태 관리 | 2차원 배열, 드래그 여부, 선택 좌표, 합계, 점수 관리 |
| DOM 조작 | `innerHTML`, `innerText`, `dataset`, `classList` |
| 이벤트 처리 | `mousedown`, `mouseenter`, `mouseup`, `mouseleave` |
| 배열 활용 | `some`, `filter`, `forEach`로 선택 검사와 점수 계산 |
| 시간 처리 | `setInterval`, `clearInterval`, 게임 종료와 재시작 |
| 시각 효과 | 타이머 바 전환, 경고 애니메이션, 결과 카드 스타일 |

<br>

## 🚀 실행 방법

### 웹에서 실행

[GitHub Pages 게임 페이지](https://nhwdev.github.io/study/)에서 바로 플레이할 수 있습니다.

### 로컬에서 실행

```bash
git clone https://github.com/nhwdev/study.git
```

내려받은 폴더의 **`TenGrid/index.html`을 브라우저로 열면** 실행됩니다. 별도의 빌드나 환경변수 설정은 필요하지 않습니다.

<br>

## 🌐 배포

학습 코드는 `study/TenGrid/index.html`에서 관리합니다. [TenGrid Pages 워크플로](../.github/workflows/tengrid-pages.yml)가 `main`의 `TenGrid/**` 변경 시 해당 폴더를 GitHub Pages에 배포합니다. 수동 배포도 지원합니다.

통합 사이트 주소는 `https://nhwdev.github.io/study/`입니다. 기존 `https://nhwdev.github.io/TenGrid/` 주소는 원본 저장소에서 유지됩니다.
