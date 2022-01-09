// Autogenerated from Pigeon (v0.1.23), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Messages {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class InitializeMessage {
    private Long maxCacheSize;
    public Long getMaxCacheSize() { return maxCacheSize; }
    public void setMaxCacheSize(Long setterArg) { this.maxCacheSize = setterArg; }

    private Long maxCacheFileSize;
    public Long getMaxCacheFileSize() { return maxCacheFileSize; }
    public void setMaxCacheFileSize(Long setterArg) { this.maxCacheFileSize = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("maxCacheSize", maxCacheSize);
      toMapResult.put("maxCacheFileSize", maxCacheFileSize);
      return toMapResult;
    }
    static InitializeMessage fromMap(Map<String, Object> map) {
      InitializeMessage fromMapResult = new InitializeMessage();
      Object maxCacheSize = map.get("maxCacheSize");
      fromMapResult.maxCacheSize = (maxCacheSize == null) ? null : ((maxCacheSize instanceof Integer) ? (Integer)maxCacheSize : (Long)maxCacheSize);
      Object maxCacheFileSize = map.get("maxCacheFileSize");
      fromMapResult.maxCacheFileSize = (maxCacheFileSize == null) ? null : ((maxCacheFileSize instanceof Integer) ? (Integer)maxCacheFileSize : (Long)maxCacheFileSize);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class TextureMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      return toMapResult;
    }
    static TextureMessage fromMap(Map<String, Object> map) {
      TextureMessage fromMapResult = new TextureMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CreateMessage {
    private String asset;
    public String getAsset() { return asset; }
    public void setAsset(String setterArg) { this.asset = setterArg; }

    private String uri;
    public String getUri() { return uri; }
    public void setUri(String setterArg) { this.uri = setterArg; }

    private String packageName;
    public String getPackageName() { return packageName; }
    public void setPackageName(String setterArg) { this.packageName = setterArg; }

    private String formatHint;
    public String getFormatHint() { return formatHint; }
    public void setFormatHint(String setterArg) { this.formatHint = setterArg; }

    private Boolean useCache;
    public Boolean getUseCache() { return useCache; }
    public void setUseCache(Boolean setterArg) { this.useCache = setterArg; }

    private Map<String, String> httpHeaders;
    public Map<String, String> getHttpHeaders() { return httpHeaders; }
    public void setHttpHeaders(Map<String, String> setterArg) { this.httpHeaders = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("asset", asset);
      toMapResult.put("uri", uri);
      toMapResult.put("packageName", packageName);
      toMapResult.put("formatHint", formatHint);
      toMapResult.put("useCache", useCache);
      toMapResult.put("httpHeaders", httpHeaders);
      return toMapResult;
    }
    static CreateMessage fromMap(Map<String, Object> map) {
      CreateMessage fromMapResult = new CreateMessage();
      Object asset = map.get("asset");
      fromMapResult.asset = (String)asset;
      Object uri = map.get("uri");
      fromMapResult.uri = (String)uri;
      Object packageName = map.get("packageName");
      fromMapResult.packageName = (String)packageName;
      Object formatHint = map.get("formatHint");
      fromMapResult.formatHint = (String)formatHint;
      Object useCache = map.get("useCache");
      fromMapResult.useCache = (Boolean)useCache;
      Object httpHeaders = map.get("httpHeaders");
      fromMapResult.httpHeaders = (Map<String, String>)httpHeaders;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class LoopingMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Boolean isLooping;
    public Boolean getIsLooping() { return isLooping; }
    public void setIsLooping(Boolean setterArg) { this.isLooping = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("isLooping", isLooping);
      return toMapResult;
    }
    static LoopingMessage fromMap(Map<String, Object> map) {
      LoopingMessage fromMapResult = new LoopingMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object isLooping = map.get("isLooping");
      fromMapResult.isLooping = (Boolean)isLooping;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class VolumeMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double volume;
    public Double getVolume() { return volume; }
    public void setVolume(Double setterArg) { this.volume = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("volume", volume);
      return toMapResult;
    }
    static VolumeMessage fromMap(Map<String, Object> map) {
      VolumeMessage fromMapResult = new VolumeMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object volume = map.get("volume");
      fromMapResult.volume = (Double)volume;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PlaybackSpeedMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Double speed;
    public Double getSpeed() { return speed; }
    public void setSpeed(Double setterArg) { this.speed = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("speed", speed);
      return toMapResult;
    }
    static PlaybackSpeedMessage fromMap(Map<String, Object> map) {
      PlaybackSpeedMessage fromMapResult = new PlaybackSpeedMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object speed = map.get("speed");
      fromMapResult.speed = (Double)speed;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PositionMessage {
    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    private Long position;
    public Long getPosition() { return position; }
    public void setPosition(Long setterArg) { this.position = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("textureId", textureId);
      toMapResult.put("position", position);
      return toMapResult;
    }
    static PositionMessage fromMap(Map<String, Object> map) {
      PositionMessage fromMapResult = new PositionMessage();
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      Object position = map.get("position");
      fromMapResult.position = (position == null) ? null : ((position instanceof Integer) ? (Integer)position : (Long)position);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MixWithOthersMessage {
    private Boolean mixWithOthers;
    public Boolean getMixWithOthers() { return mixWithOthers; }
    public void setMixWithOthers(Boolean setterArg) { this.mixWithOthers = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("mixWithOthers", mixWithOthers);
      return toMapResult;
    }
    static MixWithOthersMessage fromMap(Map<String, Object> map) {
      MixWithOthersMessage fromMapResult = new MixWithOthersMessage();
      Object mixWithOthers = map.get("mixWithOthers");
      fromMapResult.mixWithOthers = (Boolean)mixWithOthers;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class DataSourceMessage {
    private String asset;
    public String getAsset() { return asset; }
    public void setAsset(String setterArg) { this.asset = setterArg; }

    private String uri;
    public String getUri() { return uri; }
    public void setUri(String setterArg) { this.uri = setterArg; }

    private String key;
    public String getKey() { return key; }
    public void setKey(String setterArg) { this.key = setterArg; }

    private String packageName;
    public String getPackageName() { return packageName; }
    public void setPackageName(String setterArg) { this.packageName = setterArg; }

    private String formatHint;
    public String getFormatHint() { return formatHint; }
    public void setFormatHint(String setterArg) { this.formatHint = setterArg; }

    private Boolean useCache;
    public Boolean getUseCache() { return useCache; }
    public void setUseCache(Boolean setterArg) { this.useCache = setterArg; }

    private Long textureId;
    public Long getTextureId() { return textureId; }
    public void setTextureId(Long setterArg) { this.textureId = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("asset", asset);
      toMapResult.put("uri", uri);
      toMapResult.put("key", key);
      toMapResult.put("packageName", packageName);
      toMapResult.put("formatHint", formatHint);
      toMapResult.put("useCache", useCache);
      toMapResult.put("textureId", textureId);
      return toMapResult;
    }
    static DataSourceMessage fromMap(Map<String, Object> map) {
      DataSourceMessage fromMapResult = new DataSourceMessage();
      Object asset = map.get("asset");
      fromMapResult.asset = (String)asset;
      Object uri = map.get("uri");
      fromMapResult.uri = (String)uri;
      Object key = map.get("key");
      fromMapResult.key = (String)key;
      Object packageName = map.get("packageName");
      fromMapResult.packageName = (String)packageName;
      Object formatHint = map.get("formatHint");
      fromMapResult.formatHint = (String)formatHint;
      Object useCache = map.get("useCache");
      fromMapResult.useCache = (Boolean)useCache;
      Object textureId = map.get("textureId");
      fromMapResult.textureId = (textureId == null) ? null : ((textureId instanceof Integer) ? (Integer)textureId : (Long)textureId);
      return fromMapResult;
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface VideoPlayerApi {
    void initialize(InitializeMessage arg);
    TextureMessage create(CreateMessage arg);
    void dispose(TextureMessage arg);
    void setLooping(LoopingMessage arg);
    void setVolume(VolumeMessage arg);
    void setPlaybackSpeed(PlaybackSpeedMessage arg);
    void play(TextureMessage arg);
    PositionMessage position(TextureMessage arg);
    void seekTo(PositionMessage arg);
    void pause(TextureMessage arg);
    void setMixWithOthers(MixWithOthersMessage arg);
    void setDataSource(DataSourceMessage arg);

    /** Sets up an instance of `VideoPlayerApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, VideoPlayerApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.initialize", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              InitializeMessage input = InitializeMessage.fromMap((Map<String, Object>)message);
              api.initialize(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.create", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              CreateMessage input = CreateMessage.fromMap((Map<String, Object>)message);
              TextureMessage output = api.create(input);
              wrapped.put("result", output.toMap());
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.dispose", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.dispose(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setLooping", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              LoopingMessage input = LoopingMessage.fromMap((Map<String, Object>)message);
              api.setLooping(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setVolume", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VolumeMessage input = VolumeMessage.fromMap((Map<String, Object>)message);
              api.setVolume(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setPlaybackSpeed", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              PlaybackSpeedMessage input = PlaybackSpeedMessage.fromMap((Map<String, Object>)message);
              api.setPlaybackSpeed(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.play", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.play(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.position", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              PositionMessage output = api.position(input);
              wrapped.put("result", output.toMap());
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.seekTo", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              PositionMessage input = PositionMessage.fromMap((Map<String, Object>)message);
              api.seekTo(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.pause", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              TextureMessage input = TextureMessage.fromMap((Map<String, Object>)message);
              api.pause(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setMixWithOthers", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              MixWithOthersMessage input = MixWithOthersMessage.fromMap((Map<String, Object>)message);
              api.setMixWithOthers(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setDataSource", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              DataSourceMessage input = DataSourceMessage.fromMap((Map<String, Object>)message);
              api.setDataSource(input);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", null);
    return errorMap;
  }
}
