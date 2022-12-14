// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.stargrazer.android.devbyteviewer.network

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class NetworkVideoContainerJsonAdapter(
  moshi: Moshi
) : JsonAdapter<NetworkVideoContainer>() {
  private val options: JsonReader.Options = JsonReader.Options.of("videos")

  private val listOfNetworkVideoAdapter: JsonAdapter<List<NetworkVideo>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, NetworkVideo::class.java),
      emptySet(), "videos")

  public override fun toString(): String = buildString(43) {
      append("GeneratedJsonAdapter(").append("NetworkVideoContainer").append(')') }

  public override fun fromJson(reader: JsonReader): NetworkVideoContainer {
    var videos: List<NetworkVideo>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> videos = listOfNetworkVideoAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("videos", "videos", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return NetworkVideoContainer(
        videos = videos ?: throw Util.missingProperty("videos", "videos", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: NetworkVideoContainer?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("videos")
    listOfNetworkVideoAdapter.toJson(writer, value_.videos)
    writer.endObject()
  }
}
