// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: au/com/codeka/warworlds/server/proto/suspicious_event.proto at 9:1
package au.com.codeka.warworlds.server.proto;

import au.com.codeka.warworlds.common.proto.StarModification;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * A suspicious event is something we record when a client sends us something that we don't expect.
 * It could be an early indication of attempted cheating, or bugs in the client or something else.
 */
public final class SuspiciousEvent extends Message<SuspiciousEvent, SuspiciousEvent.Builder> {
  public static final ProtoAdapter<SuspiciousEvent> ADAPTER = new ProtoAdapter_SuspiciousEvent();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_TIMESTAMP = 0L;

  public static final Long DEFAULT_STAR_ID = 0L;

  public static final String DEFAULT_MESSAGE = "";

  /**
   * The time this event happened.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long timestamp;

  /**
   * The ID of the star that was being attempted to modify.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long star_id;

  /**
   * The modification that we deemed to be suspicious.
   */
  @WireField(
      tag = 3,
      adapter = "au.com.codeka.warworlds.common.proto.StarModification#ADAPTER"
  )
  public final StarModification modification;

  /**
   * A message describining what we thought was supicious.
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String message;

  public SuspiciousEvent(Long timestamp, Long star_id, StarModification modification, String message) {
    this(timestamp, star_id, modification, message, ByteString.EMPTY);
  }

  public SuspiciousEvent(Long timestamp, Long star_id, StarModification modification, String message, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.timestamp = timestamp;
    this.star_id = star_id;
    this.modification = modification;
    this.message = message;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.timestamp = timestamp;
    builder.star_id = star_id;
    builder.modification = modification;
    builder.message = message;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SuspiciousEvent)) return false;
    SuspiciousEvent o = (SuspiciousEvent) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(timestamp, o.timestamp)
        && Internal.equals(star_id, o.star_id)
        && Internal.equals(modification, o.modification)
        && Internal.equals(message, o.message);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      result = result * 37 + (star_id != null ? star_id.hashCode() : 0);
      result = result * 37 + (modification != null ? modification.hashCode() : 0);
      result = result * 37 + (message != null ? message.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (timestamp != null) builder.append(", timestamp=").append(timestamp);
    if (star_id != null) builder.append(", star_id=").append(star_id);
    if (modification != null) builder.append(", modification=").append(modification);
    if (message != null) builder.append(", message=").append(message);
    return builder.replace(0, 2, "SuspiciousEvent{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SuspiciousEvent, Builder> {
    public Long timestamp;

    public Long star_id;

    public StarModification modification;

    public String message;

    public Builder() {
    }

    /**
     * The time this event happened.
     */
    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * The ID of the star that was being attempted to modify.
     */
    public Builder star_id(Long star_id) {
      this.star_id = star_id;
      return this;
    }

    /**
     * The modification that we deemed to be suspicious.
     */
    public Builder modification(StarModification modification) {
      this.modification = modification;
      return this;
    }

    /**
     * A message describining what we thought was supicious.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    @Override
    public SuspiciousEvent build() {
      return new SuspiciousEvent(timestamp, star_id, modification, message, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SuspiciousEvent extends ProtoAdapter<SuspiciousEvent> {
    ProtoAdapter_SuspiciousEvent() {
      super(FieldEncoding.LENGTH_DELIMITED, SuspiciousEvent.class);
    }

    @Override
    public int encodedSize(SuspiciousEvent value) {
      return (value.timestamp != null ? ProtoAdapter.INT64.encodedSizeWithTag(1, value.timestamp) : 0)
          + (value.star_id != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.star_id) : 0)
          + (value.modification != null ? StarModification.ADAPTER.encodedSizeWithTag(3, value.modification) : 0)
          + (value.message != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.message) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SuspiciousEvent value) throws IOException {
      if (value.timestamp != null) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.timestamp);
      if (value.star_id != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.star_id);
      if (value.modification != null) StarModification.ADAPTER.encodeWithTag(writer, 3, value.modification);
      if (value.message != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.message);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SuspiciousEvent decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.timestamp(ProtoAdapter.INT64.decode(reader)); break;
          case 2: builder.star_id(ProtoAdapter.INT64.decode(reader)); break;
          case 3: builder.modification(StarModification.ADAPTER.decode(reader)); break;
          case 4: builder.message(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public SuspiciousEvent redact(SuspiciousEvent value) {
      Builder builder = value.newBuilder();
      if (builder.modification != null) builder.modification = StarModification.ADAPTER.redact(builder.modification);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
