package su.igc.discordauth;

import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

public class Config {

    public static String discordBotToken;
    public static String accountsFilePath;
    public static int sessionExpiredDelay;

    public static int codeCreatorExpiredDelay;
    public static int codeCreatorMinimum;
    public static int codeCreatorMaximum;

    public static boolean giveTempCodeEventsIsClickEvent;
    public static boolean giveTempCodeEventsIsHoverEvent;
    public static Integer giveTempCodeEventsClickMode;
    public static String giveTempCodeEventsHoverText;

    public static String messageSuccessfulAuthorization;
    public static String messageCodeNotFound;
    public static String messageNotYoursCode;
    public static String messageGiveTempCode;
    public static String messageNotFreeTempCodeError;
    public static String messageRegistrationInstructions;
    public static String messageLoginInstructions;
    public static String messageAccountCreatingConfirming;
    public static String messageAuthorizationTimeout;
    public static String messagePlayerKickPluginDisabled;
    public static String messageCommandMissingPermissions;
    public static String messageCommandSuccess;
    public static String messageCommandError;

    public static String globalMessageFormat;

    public static void init(@NotNull FileConfiguration data) {
        Config.discordBotToken = data.getString("discordBotToken");
        Config.accountsFilePath = data.getString("accountsFilePath");
        Config.sessionExpiredDelay = data.getInt("sessionExpiredDelay");

        Config.codeCreatorExpiredDelay = data.getInt("codeCreator.ExpiredDelay");
        Config.codeCreatorMinimum = data.getInt("codeCreator.Minimum");
        Config.codeCreatorMaximum = data.getInt("codeCreator.Maximum");

        Config.giveTempCodeEventsIsClickEvent = data.getBoolean("giveTempCodeEvents.IsClickEvent");
        Config.giveTempCodeEventsIsHoverEvent = data.getBoolean("giveTempCodeEvents.IsHoverEvent");
        Config.giveTempCodeEventsClickMode = data.getInt("giveTempCodeEvents.ClickMode");
        Config.giveTempCodeEventsHoverText = data.getString("giveTempCodeEvents.HoverText");

        Config.messageSuccessfulAuthorization = data.getString("message.SuccessfulAuthorization");
        Config.messageCodeNotFound = data.getString("message.CodeNotFound");
        Config.messageNotYoursCode = data.getString("message.NotYoursCode");
        Config.messageGiveTempCode = data.getString("message.GiveTempCode");
        Config.messageNotFreeTempCodeError = data.getString("message.NotFreeTempCodeError");
        Config.messageRegistrationInstructions = data.getString("message.RegistrationInstructions");
        Config.messageLoginInstructions = data.getString("message.LoginInstructions");
        Config.messageAccountCreatingConfirming = data.getString("message.AccountCreatingConfirming");
        Config.messageAuthorizationTimeout = data.getString("message.AuthorizationTimeout");
        Config.messagePlayerKickPluginDisabled = data.getString("message.PlayerKickPluginDisabled");
        Config.messageCommandMissingPermissions = data.getString("message.CommandMissingPermissions");
        Config.messageCommandSuccess = data.getString("message.CommandSuccess");
        Config.messageCommandError = data.getString("message.CommandError");

        Config.globalMessageFormat = data.getString("message.GlobalMessageFormat");
    }


}
