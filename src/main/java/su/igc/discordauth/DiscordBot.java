package su.igc.discordauth;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;
import javax.security.auth.login.LoginException;

public class DiscordBot extends ListenerAdapter  {

    public static JDA bot;

    public static void init() throws LoginException {
        DiscordBot.bot = JDABuilder.createDefault(Config.discordBotToken)
            .setChunkingFilter(ChunkingFilter.ALL)
            .setMemberCachePolicy(MemberCachePolicy.ALL)
            .enableIntents(GatewayIntent.GUILD_PRESENCES)
            .enableIntents(GatewayIntent.GUILD_MEMBERS)
            .addEventListeners(new DiscordBot())
            .build();
    }

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        Bukkit.getLogger().info("==Bot ready==");
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        User author = event.getAuthor();
        String content = event.getMessage().getContentRaw();

        if (!channel.getType().isGuild()) {
            Bukkit.getLogger().info(String.format("%s %s", author.getName(), content));
        }
    }
}
