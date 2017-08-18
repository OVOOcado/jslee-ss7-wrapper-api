/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.map.args;


import java.io.Serializable;


/**
 * Created by karolsimka on 03.07.17.
 */
public interface SmRpUiWrapper extends Serializable {

    /**
     * Gets the data.
     *
     * @return the data
     */
    byte[] getData();
    
    /**
     * Gets the text.
     *
     * @return the text
     */
    String getText();

    /**
     * Gets the charset.
     *
     * @return the charset
     */
    DataCodingWrapper getCharset();

    /**
     * Gets the originating address.
     *
     * @return the originating address
     */
    String getOriginatingAddress();

    /**
     * Gets the more messages to send.
     *
     * @return the more messages to send
     */
    boolean getMoreMessagesToSend();

    /**
     * Gets the checks if is concatened.
     *
     * @return the checks if is concatened
     */
    boolean getIsConcatened();

    /**
     * Gets the message ref.
     *
     * @return the message ref
     */
    int getMessageRef();

    /**
     * Gets the segm cnt.
     *
     * @return the segm cnt
     */
    int getSegmCnt();

    /**
     * Gets the segm num.
     *
     * @return the segm num
     */
    int getSegmNum();
}
