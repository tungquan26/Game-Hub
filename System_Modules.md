# Game Tournament Management System — System Modules

## 1. Module Authentication & User Management

### Công dụng

Module `Authentication & User Management` phụ trách quản lý thông tin người dùng và các vai trò người dùng trong hệ thống. Module là nơi chứa model cơ sở `User` và các model người dùng chuyên biệt kế thừa từ `User`.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `User` | Model cơ sở lưu thông tin chung của người dùng. |
| `Player` | Đại diện cho người chơi, kế thừa từ `User`. |
| `Organizer` | Đại diện cho người tổ chức giải đấu, kế thừa từ `User`. |
| `Admin` | Đại diện cho quản trị viên, kế thừa từ `User`. |

---

## 2. Module Team Management

### Công dụng

Module `Team Management` phụ trách quản lý đội thi đấu và thành viên của đội. Module cho phép biểu diễn thông tin đội, đội trưởng và các người chơi tham gia đội.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `Team` | Đại diện cho một đội thi đấu. |
| `TeamMember` | Model trung gian biểu diễn thành viên của đội và mối quan hệ giữa `Player` với `Team`. |

---

## 3. Module Tournament Management

### Công dụng

Module `Tournament Management` phụ trách quản lý thông tin của các giải đấu, bao gồm giải đấu nào được tổ chức, người tổ chức và các thông tin cơ bản của giải.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `Tournament` | Đại diện cho một giải đấu trong hệ thống. |

---

## 4. Module Tournament Registration

### Công dụng

Module `Tournament Registration` phụ trách quản lý việc các đội đăng ký tham gia giải đấu và trạng thái đăng ký của đội.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `Registration` | Model trung gian biểu diễn việc một `Team` đăng ký tham gia một `Tournament`. |

---

## 5. Module Match & Schedule Management

### Công dụng

Module `Match & Schedule Management` phụ trách quản lý các trận đấu, đội tham gia trận đấu, lịch thi đấu, trạng thái trận đấu và kết quả của trận đấu.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `Match` | Đại diện cho một trận đấu giữa hai đội và thông tin lịch thi đấu. |
| `MatchResult` | Lưu kết quả của một trận đấu, bao gồm điểm số và đội chiến thắng. |

---

## 6. Module Bracket Management

### Công dụng

Module `Bracket Management` phụ trách quản lý cấu trúc thi đấu của giải, bao gồm bảng đấu, các vòng đấu và các trận đấu thuộc từng vòng.

### Các model tạo nên module

| Model | Vai trò |
|---|---|
| `Bracket` | Đại diện cho bảng đấu của một giải đấu. |
| `Round` | Đại diện cho một vòng đấu trong `Bracket`. |
| `Match` | Đại diện cho các trận đấu thuộc từng `Round`. |

---

## 7. Module Ranking Management

### Công dụng


### Các model tạo nên module


---

## 8. Module Statistics Management

### Công dụng


### Các model tạo nên module


---

## 9. Module Notification Management

### Công dụng


### Các model tạo nên module

