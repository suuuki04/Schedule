# API 명세서

| 기능 | Method | Url | request | response | 상태코드 |
| --- | --- | --- | --- | --- | --- |
| 일정 생성 | POST | /api/schedules | 요청 body | 등록 정보 | 200: 정상등록, 400: BadRequest(필수값 없는 경우) |
| 일정 조회 | GET | /api/schedules |  | 다건 응답 정보 | 200: 정상조회 |
| 선택 일정 조회 | GET | /api/schedules/{scheduled} |  | 단건 응답 정보 | 200: 정상조회, 404: NotFound(해당 식별자의 메모가 존재하지 않음) |
| 선택 일정 수정 | PUT | /api/schedules/{scheduled} | 요청 body | 수정 정보 | 200: 정상수정, 400: BadRequest(필수값 없는 경우),404: NotFound(해당 식별자의 메모가 존재하지 않음) |
| 선택 일정 삭제 | DELETE | /api/schedules/{scheduled} |  | - | 200: 정상삭제, 404: NotFound(해당 식별자의 메모가 존재하지 않음) |

# **일정 생성**

**일정을 생성합니다**

| 메서드 | 요청 URL |
| --- | --- |
| POST | http://{SERVER_URL}/api/schedules |

**Request** 

| **파라미터** | **타입** | **설명** |
| --- | --- | --- |
| password | String | 비밀번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |

**예시**

{
  ”password” : “비밀번호”
  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

}

**Response** 

| **파라미터** | **타입** | **설명** |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”
}

# **일정 조회**

일정을 조회합니다.

| 메서드 | 요청 URL |
| --- | --- |
| GET | http://{SERVER_URL}/api/schedules |

일정의 내역들을 조회합니다

**Request**

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

{
 [
  {
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”

  },
  {
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”

  }
  //….
 ]
}

# **선택 일정 조회**

선택한 일정을 조회합니다.

| 메서드 | 요청 URL |
| --- | --- |
| GET | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정의 상세 내역을 조회합니다

**Request**

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

<aside>

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”
}

</aside>

# **선택 일정 수정**

선택한 일정을 수정합니다.

| 메서드 | 요청 URL |
| --- | --- |
| PUT | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정을 수정합니다

**Request**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| password | String | 비밀번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |

**예시**

<aside>

{
  ”password” : “비밀번호”
  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

}

</aside>

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| updateAt | Integer | 수정 날짜 |

**예시**

<aside>

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “update” : “2024-11-04”
}

</aside>

# **선택 일정 삭제**

선택한 일정을 삭제 합니다.

| 메서드 | 요청 URL |
| --- | --- |
| DELETE | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정을 삭제합니다

**Request**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| passport | Integer | 비밀번호 |

**예시**

<aside>

{
  ”passport” : “비밀번호”
}

</aside>

**Response**

---

# **ERD**
# API 명세서

| 기능 | Method | Url | request | response | 상태코드 |
| --- | --- | --- | --- | --- | --- |
| 일정 생성 | POST | /api/schedules | 요청 body | 등록 정보 | 200: 정상등록 
400: BadRequest(필수값 없는 경우) |
| 일정 조회 | GET | /api/schedules |  | 다건 응답 정보 | 200: 정상조회 |
| 선택 일정 조회 | GET | /api/schedules/{scheduled} |  | 단건 응답 정보 | 200: 정상조회
404: NotFound(해당 식별자의 메모가 존재하지 않음) |
| 선택 일정 수정 | PUT | /api/schedules/{scheduled} | 요청 body | 수정 정보 | 200: 정상수정
400: BadRequest(필수값 없는 경우)
404: NotFound(해당 식별자의 메모가 존재하지 않음) |
| 선택 일정 삭제 | DELETE | /api/schedules/{scheduled} |  | - | 200: 정상삭제 
404: NotFound(해당 식별자의 메모가 존재하지 않음) |

# **일정 생성**

**일정을 생성합니다**

| 메서드 | 요청 URL |
| --- | --- |
| POST | http://{SERVER_URL}/api/schedules |

**Request** 

| **파라미터** | **타입** | **설명** |
| --- | --- | --- |
| password | String | 비밀번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |

**예시**

{
  ”password” : “비밀번호”
  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

}

**Response** 

| **파라미터** | **타입** | **설명** |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”
}

# **일정 조회**

일정을 조회합니다.

| 메서드 | 요청 URL |
| --- | --- |
| GET | http://{SERVER_URL}/api/schedules |

일정의 내역들을 조회합니다

**Request**

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

{
 [
  {
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”

  },
  {
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”

  }
  //….
 ]
}

# **선택 일정 조회**

선택한 일정을 조회합니다.

| 메서드 | 요청 URL |
| --- | --- |
| GET | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정의 상세 내역을 조회합니다

**Request**

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유 번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| creatAt | Integer | 작성 날짜 |

**예시**

<aside>

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “date” : “2024-11-02”
}

</aside>

# **선택 일정 수정**

선택한 일정을 수정합니다.

| 메서드 | 요청 URL |
| --- | --- |
| PUT | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정을 수정합니다

**Request**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| password | String | 비밀번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |

**예시**

<aside>

{
  ”password” : “비밀번호”
  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

}

</aside>

**Response**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| id | Integer | 일정 고유번호 |
| username | String | 작성자 이름 |
| title | String | 일정 제목 |
| content | String | 일정 세부 내용 |
| updateAt | Integer | 수정 날짜 |

**예시**

<aside>

{
  ”id” : “1”

  ”username” : “작성자 이름”
  ”title” : “제목”
  ”content” : “내용”

  “update” : “2024-11-04”
}

</aside>

# **선택 일정 삭제**

선택한 일정을 삭제 합니다.

| 메서드 | 요청 URL |
| --- | --- |
| DELETE | http://{SERVER_URL}/api/schedules/{scheduled} |

선택한 일정을 삭제합니다

**Request**

| 메소드 | 타입 | 설명 |
| --- | --- | --- |
| passport | Integer | 비밀번호 |

**예시**

<aside>

{
  ”passport” : “비밀번호”
}

</aside>

**Response**

---

# **ERD**
![image](https://github.com/user-attachments/assets/add68c99-375e-4984-b596-c610fd479a1c)
