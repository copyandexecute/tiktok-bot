package de.hglabor.tiktok;

import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.downloader.request.RequestChannelUploads;
import com.github.kiulian.downloader.downloader.response.Response;
import com.github.kiulian.downloader.model.playlist.PlaylistInfo;
import com.github.kiulian.downloader.model.playlist.PlaylistVideoDetails;

public final class TikTokBot {
    public static void main(String[] args) {
        fetchAllVideos("noriskk");
    }

    private static void fetchAllVideos(String channelName) {
        YoutubeDownloader downloader = new YoutubeDownloader();
        RequestChannelUploads request = new RequestChannelUploads(channelName);
        Response<PlaylistInfo> response = downloader.getChannelUploads(request);
        PlaylistInfo playlistInfo = response.data();
        for (PlaylistVideoDetails video : playlistInfo.videos()) {
            System.out.println("Video: " + video.title());
        }
    }
}
