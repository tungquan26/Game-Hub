package services;

import registration.model.Registration; // Cập nhật lại import cho đúng với package chứa Registration của bạn
import enums.CheckInStatus;
import enums.RegistrationStatus;
import team.model.Team;
import tournament.model.Tournament;

import java.time.LocalDateTime;

public class RegistrationModule {

    public RegistrationModule() {}

    /**
     * Xử lý logic đăng ký của một đội vào giải đấu.
     * @param isPrivateMode
     */
    public Registration registerTeamForTournament(Team team, Tournament tournament, boolean isPrivateMode) {
        Registration newRegistration = new Registration();
        newRegistration.setTeam(team);
        newRegistration.setTournament(tournament);
        newRegistration.setRegistrationDate(LocalDateTime.now());
        
        
        newRegistration.setCheckInStatus(CheckInStatus.NOT_CHECKED_IN);

        int currentMembers = team.getMembers().size();

        if (currentMembers > 7) {
            newRegistration.setStatus(RegistrationStatus.REJECTED);
            System.out.println("Từ chối: Đội " + team.getTeamName() + " vượt quá 7 thành viên.");
            return newRegistration;
        }

        if (currentMembers >= 5) {
            newRegistration.setStatus(RegistrationStatus.APPROVED);
            System.out.println("Thành công: Đội " + team.getTeamName() + " đã đăng ký hợp lệ.");
        } 
        else {
            newRegistration.setStatus(RegistrationStatus.PENDING);
            
            if (isPrivateMode) {
                System.out.println("Waiting: Đội " + team.getTeamName() + " (Private) đang chờ bạn bè gia nhập để đủ 5 người.");
            } else {
                System.out.println("Matchmaking: Đội " + team.getTeamName() + " (Public) đã được đẩy vào hàng đợi ghép đội ngẫu nhiên dựa trên Elo.");
                // Sẽ gọi sang MatchmakingService ở đây
            }
        }

        return newRegistration;
    }
}