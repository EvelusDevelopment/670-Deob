import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

final class qk {

   static int f;
   static int b;
   static int a;
   static int g;
   static int c;
   static boolean d = false;
   static int e;


   static final void a(int var0, Object[] var1, OggPacket var2) {
      try {
         ++e;
         if(var1 == null || -5 != ~var1.length) {
            int var3;
            Object[] var33;
            if(var1 != null && 10 == var1.length) {
               if(3 > ((int[])((int[])var1[1]))[0]) {
                  var3 = ((VorbisInfo)var1[6]).headerIn((VorbisComment)var1[8], var2);
                  if(0 > var3) {
                     throw new IllegalStateException("" + var3);
                  }

                  if(((int[])((int[])var1[1]))[0] == 2) {
                     if(-3 > ~((VorbisInfo)var1[6]).channels || 1 > ((VorbisInfo)var1[6]).channels) {
                        throw new RuntimeException("" + ((VorbisInfo)var1[6]).channels);
                     }

                     var1[9] = new DSPState((VorbisInfo)var1[6]);
                     var1[4] = new VorbisBlock((DSPState)var1[9]);
                     var1[3] = qi.a(new Object[2], ((VorbisInfo)var1[6]).rate, mc.a, 1);
                     Object[] var6 = new Object[4];
                     int var35 = ((VorbisInfo)var1[6]).channels;
                     oc.a(var6, (byte)-62);
                     oea.b(var6, 0);
                     ws var37 = new ws(var6);
                     var6[2] = var37;
                     ((int[])((int[])var6[1]))[3] = var35;
                     var1[7] = var6;
                  }
               } else {
                  if(((VorbisBlock)var1[4]).synthesis(var2) == 0) {
                     ((DSPState)var1[9]).blockIn((VorbisBlock)var1[4]);
                  }

                  float[][] var31 = ((DSPState)var1[9]).pcmOut(((VorbisInfo)var1[6]).channels);
                  ((double[])((double[])var1[5]))[0] = ((DSPState)var1[9]).granuleTime();
                  if(-1.0D == ((double[])((double[])var1[5]))[0]) {
                     ((double[])((double[])var1[5]))[0] = (double)((float)((int[])((int[])var1[1]))[1] / (float)((VorbisInfo)var1[6]).rate);
                  }

                  ((DSPState)var1[9]).read(var31[0].length);
                  ((int[])((int[])var1[1]))[1] += var31[0].length;
                  var33 = (Object[])((Object[])var1[7]);
                  int var34 = var31[0].length;
                  double var36 = ((double[])((double[])var1[5]))[0];
                  long var10 = (long)(((int[])((int[])var33[1]))[3] << 0 | var34);
                  ota var39;
                  Object[] var12 = (var39 = (ota)uh.a(sl.a, var10, (byte)87)) != null?var39.x:null;
                  if(var12 != null) {
                     ((double[])((double[])var12[2]))[0] = var36;
                     Object[] var13 = sl.a;
                     tha var14 = (tha)pm.a(var10, (Object[])((Object[])var13[3]), false);
                     if(var14 != null) {
                        var14.a((byte)79);
                        var14.a(8192);
                        ++((int[])((int[])var13[1]))[0];
                     }
                  } else {
                     var12 = pg.a(var36, new short[((int[])((int[])var33[1]))[3]][var34], new Object[3], (byte)-95);
                  }

                  Object[] var38 = var12;
                  float[][] var41 = var31;
                  short[][] var40 = (short[][])((short[][])var12[1]);
                  if(null != var12 && 14 == var12.length) {
                     return;
                  }

                  int var43;
                  for(var43 = 0; var43 < var41.length; ++var43) {
                     for(int var44 = 0; var40[var43].length > var44; ++var44) {
                        var40[var43][var44] = (short)((int)(var41[var43][var44] * 16383.0F));
                     }

                     if(var33 != null && var33.length == 6) {
                        a(1, (Object[])null, (OggPacket)null);
                     }
                  }

                  for(var43 = 0; var43 < ((VorbisInfo)var1[6]).channels; ++var43) {
                     short[][] var42 = (short[][])((short[][])var38[1]);
                     Object[] var16 = (Object[])((Object[])var1[3]);
                     short[] var17 = ((short[][])((short[][])var38[1]))[var43];
                     if(null != var16[0]) {
                        int var18 = 14 + (int)((long)var17.length * (long)((int[])((int[])var16[1]))[1] / (long)((int[])((int[])var16[1]))[0]);
                        int[] var19 = new int[var18];
                        if(null != var38 && 4 == var38.length) {
                           fsa.a(var0 ^ 1, (Object[])null, (OggStreamState)null);
                        }

                        int var20 = 0;
                        int var21 = 0;

                        int var22;
                        for(var22 = 0; var22 < var17.length; ++var22) {
                           if(null != var1 && -9 == ~var1.length && var1[7].equals(Boolean.valueOf(false)) && var1[7].equals(Integer.valueOf(2))) {
                              return;
                           }

                           short var23 = var17[var22];
                           int[] var24 = ((int[][])((int[][])var16[0]))[var21];

                           int var25;
                           for(var25 = 0; var25 < 14; ++var25) {
                              var19[var25 + var20] += var23 * var24[var25] >> 2;
                           }

                           var21 += ((int[])((int[])var16[1]))[1];
                           var25 = var21 / ((int[])((int[])var16[1]))[0];
                           var20 += var25;
                           var21 -= ((int[])((int[])var16[1]))[0] * var25;
                        }

                        var17 = new short[var18];

                        for(var22 = 0; var18 > var22; ++var22) {
                           int var45 = var19[var22] + 8192 >> 14;
                           if(var45 < -32768) {
                              var17[var22] = -32768;
                           } else if(32767 < var45) {
                              var17[var22] = 32767;
                           } else {
                              var17[var22] = (short)var45;
                           }
                        }
                     }

                     var42[var43] = var17;
                  }

                  var12 = (Object[])((Object[])var1[7]);
                  synchronized(var12) {
                     while(-101 >= ~((int[])((int[])var12[1]))[1]) {
                        jca.b((byte)77, (Object[])((Object[])var12[0]));
                        --((int[])((int[])var12[1]))[1];
                     }

                     client.a(-87, (Object[])((Object[])var12[0]), (lm)(var38 == null?null:var38[0]));
                     if(null != var33 && -4 == ~var33.length) {
                        dta.a(var0 + 86, (Object[])null);
                     }

                     ++((int[])((int[])var12[1]))[1];
                  }
               }
            } else {
               int var4;
               if(null != var1 && 7 == var1.length) {
                  if(((int[])((int[])var1[1]))[0] <= 0 || "SUB".equals(var1[4])) {
                     Object[] var30 = jta.a((byte)-82, var2.getData(), new Object[3]);
                     var4 = fh.a(var30, false);
                     if(8 < ((int[])((int[])var1[1]))[0]) {
                        if(0 == var4) {
                           long var5 = jaa.a(-99, var30);
                           long var7 = jaa.a(-119, var30);
                           long var9 = jaa.a(-94, var30);
                           if(~var5 > -1L || var7 < 0L || var9 < 0L || ~var9 < ~var5) {
                              throw new IllegalStateException();
                           }

                           ((float[])((float[])var1[5]))[1] = (float)(var5 * (long)((int[])((int[])var1[1]))[2]) / (float)((int[])((int[])var1[1]))[1];
                           ((float[])((float[])var1[5]))[0] = (float)((long)((int[])((int[])var1[1]))[2] * (var7 + var5)) / (float)((int[])((int[])var1[1]))[1];
                           int var11 = laa.a((byte)66, var30);
                           if(0 > var11 || -((int[])((int[])var30[1]))[0] + ((byte[])((byte[])var30[2])).length < var11) {
                              throw new IllegalStateException();
                           }

                           var1[3] = ki.a(var11, (byte[])((byte[])var30[2]), var0 ^ -47, ((int[])((int[])var30[1]))[0]);
                        }

                        if((var4 | 128) == 0) {
                           ;
                        }
                     } else {
                        if((var4 | 128) == 0) {
                           throw new IllegalStateException();
                        }

                        if(-1 == ~((int[])((int[])var1[1]))[0]) {
                           ((int[])((int[])var30[1]))[0] += 23;
                           ((int[])((int[])var1[1]))[1] = laa.a((byte)66, var30);
                           ((int[])((int[])var1[1]))[2] = laa.a((byte)66, var30);
                           if(-1 == ~((int[])((int[])var1[1]))[1] || ((int[])((int[])var1[1]))[2] == 0) {
                              throw new IllegalStateException();
                           }

                           var33 = hi.newByteBufferWrapper(16);
                           Class_h.a((byte)-71, 16, var30, (byte[])((byte[])var33[2]), 0);
                           var1[6] = ara.b((byte)61, var33);
                           ((int[])((int[])var33[1]))[0] = 0;
                           Class_h.a((byte)-71, 16, var30, (byte[])((byte[])var33[2]), 0);
                           var1[4] = ara.b((byte)61, var33);
                        }
                     }
                  }
               } else {
                  if(null == var1 || -14 != ~var1.length) {
                     throw new IllegalStateException();
                  }

                  if(!((boolean[])((boolean[])var1[8]))[2]) {
                     var3 = ((SetupInfo)var1[6]).decodeHeader((TheoraInfo)var1[12], (TheoraComment)var1[4], var2);
                     if(var3 != 0) {
                        if(var3 < 0) {
                           throw new IllegalStateException("" + var3);
                        }
                     } else {
                        ((boolean[])((boolean[])var1[8]))[2] = true;
                        if(((TheoraInfo)var1[12]).frameWidth > 2048 || -1025 > ~((TheoraInfo)var1[12]).frameHeight) {
                           throw new IllegalStateException();
                        }

                        var1[7] = new DecoderContext((TheoraInfo)var1[12], (SetupInfo)var1[6]);
                        var1[5] = new GranulePos();
                        var1[10] = new Frame(((TheoraInfo)var1[12]).frameWidth, ((TheoraInfo)var1[12]).frameHeight);
                        ((int[])((int[])var1[1]))[1] = ((DecoderContext)var1[7]).getMaxPostProcessingLevel();
                        var4 = ((int[])((int[])var1[1]))[2];
                        ((int[])((int[])var1[1]))[2] = var4;
                        if(((boolean[])((boolean[])var1[8]))[2]) {
                           if(((int[])((int[])var1[1]))[1] < ((int[])((int[])var1[1]))[2]) {
                              ((int[])((int[])var1[1]))[2] = ((int[])((int[])var1[1]))[1];
                           }

                           if(((int[])((int[])var1[1]))[2] < 0) {
                              ((int[])((int[])var1[1]))[2] = 0;
                           }

                           ((DecoderContext)var1[7]).setPostProcessingLevel(((int[])((int[])var1[1]))[2]);
                        }
                     }
                  } else {
                     label341: {
                        ((long[])((long[])var1[9]))[0] = he.a(89);
                        var3 = ((DecoderContext)var1[7]).decodePacketIn(var2, (GranulePos)var1[5]);
                        if(0 > var3) {
                           throw new IllegalStateException("" + var3);
                        }

                        ((DecoderContext)var1[7]).granuleFrame((GranulePos)var1[5]);
                        ((double[])((double[])var1[3]))[0] = ((DecoderContext)var1[7]).granuleTime((GranulePos)var1[5]);
                        if(((boolean[])((boolean[])var1[8]))[1]) {
                           boolean var32 = -2 == ~var2.isKeyFrame();
                           if(!var32) {
                              break label341;
                           }

                           ((boolean[])((boolean[])var1[8]))[1] = false;
                        }

                        if(!((boolean[])((boolean[])var1[8]))[0] || var2.isKeyFrame() == 1) {
                           if(0 != ((DecoderContext)var1[7]).decodeFrame((Frame)var1[10])) {
                              throw new IllegalStateException("" + var3);
                           }

                           ((boolean[])((boolean[])var1[8]))[3] = true;
                        }
                     }
                  }
               }
            }
         }

         ++((int[])((int[])var1[var0]))[0];
      } catch (RuntimeException var29) {
         throw vt.a(var29, "qk.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final String a(int var0, int var1, Object[] var2) {
      if(var0 > -116) {
         a(-31, 43, -42, -89, 115, -8, (Object[])null, ((int[])((int[])var2[0]))[0], 36, -124);
      }

      ++f;
      if(var2[2] == null) {
         return (String)var2[0];
      } else if(!(var2[2] instanceof String[])) {
         ns var3;
         Object[] var6 = (var3 = (ns)pm.a((long)var1, (Object[])((Object[])var2[2]), false)) == null?null:var3.n;
         return null == var6?(String)var2[0]:(String)var6[0];
      } else {
         String[] var4 = (String[])((String[])var2[2]);
         if(0 <= var1 && ~var1 > ~var4.length) {
            String var5 = var4[var1];
            return null == var5?(String)var2[0]:var5;
         } else {
            return (String)var2[0];
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, Object[] var6, int var7, int var8, int var9) {
      ++a;
      if(var8 != 0) {
         a(59, 109, -58, 13, ((int[])((int[])var6[0]))[1], 97, (Object[])null, ((int[])((int[])((Object[])((Object[])var6[2]))[2]))[0], -103, -92);
      }

      if(bva.a(var6, (byte)-128)) {
         client.a((Object[])((Object[])var6[32]), fb.a(false, (Object[])((Object[])var6[32])), -1, var0, var5, var2, var4, var7, var3, var1, var9);
      }
   }

   static final Object[] a(Object[] var0, byte[] var1, int var2) {
      var0[1] = Class_ss.a(var0, (byte)-109);
      ++b;
      var0[0] = var1;
      if(var2 != -19091) {
         ((boolean[])((boolean[])var0[0]))[7] = true;
      }

      return var0;
   }

   static final Object[][] a(boolean var0, Object[] var1) {
      ++c;
      if(null == var1[1]) {
         int var2 = ((Object[])((Object[])var1[2])).length;
         var1[1] = new Object[var2][];
         qo.a((Object[])((Object[])var1[2]), 0, (Object[])((Object[])var1[1]), 0, ((Object[])((Object[])var1[2])).length);
      }

      return var0?(Object[][])((Object[][])null):(Object[][])((Object[][])var1[1]);
   }

   static final void a(byte var0) {
      ++g;
      int var1;
      if(uia.d != null) {
         for(var1 = 0; ~var1 > ~uia.d.length; ++var1) {
            for(int var2 = 0; uia.d[var1].length > var2; ++var2) {
               uia.d[var1][var2] = pea.d;
            }
         }
      }

      var1 = 22 / ((var0 + 27) / 59);
   }

}
