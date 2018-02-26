package com.qulix.gifapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Olgerd on 25.02.2018.
 */
public class Images {

    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("480w_still")
    @Expose
    private com.qulix.gifapp.model._480wStill _480wStill;

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public com.qulix.gifapp.model._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(com.qulix.gifapp.model._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

}
