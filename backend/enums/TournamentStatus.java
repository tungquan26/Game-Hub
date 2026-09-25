package enums;
//Xác định trạng thái hiện tại của một Tournament, từ lúc mở đăng ký cho đến khi hoàn thành hoặc bị hủy.
public enum TournamentStatus {
    OPEN_REGISTRATION,
    REGISTRATION_CLOSED,
    ONGOING,
    COMPLETED,
    CANCELLED
}